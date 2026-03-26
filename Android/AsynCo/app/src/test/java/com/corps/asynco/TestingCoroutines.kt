package com.corps.asynco

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.currentTime
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlinx.coroutines.withContext
import org.junit.Before
import org.junit.Test
import kotlin.time.Duration.Companion.seconds

@OptIn(ExperimentalCoroutinesApi::class)
class TestingCoroutines {
    @Before
    fun setUp() {
        Dispatchers.setMain(StandardTestDispatcher())
    }

    @OptIn(DelicateCoroutinesApi::class)
    @Test
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `test one`() = runTest {
        val repository = TestableRepository()
        val viewModel = SomeViewModel(repository, StandardTestDispatcher())

        viewModel.performPeriodicWork()
        advanceTimeBy(20.seconds)
        viewModel.stopPeriodicWork()

        assertEquals(repository.workDoneCount, 2)
        assertEquals(currentTime, 20000)
    }

    /*
    -----------------
     */
    class SomeViewModel(
        private val someRepository: Repository,
        private val dispatcher: CoroutineDispatcher
    ) : ViewModel() {

        var periodicJob: Job? = null

        fun performPeriodicWork() {
            stopPeriodicWork()
            periodicJob = viewModelScope.launch {
                withContext(dispatcher) {
                    while (isActive) {
                        someRepository.doWork()
                        delay(10.seconds)
                    }
                }
            }
        }

        fun stopPeriodicWork() {
            periodicJob?.cancel()
        }
    }

    interface Repository {
        suspend fun doWork()
    }

    class TestableRepository : Repository {
        var workDoneCount = 0

        override suspend fun doWork() {
            workDoneCount++
            println("$workDoneCount work done!")
        }
    }


    suspend fun fetchData(): String {
        delay(1000L)
        return "Hello world"
    }

    //Wrapping your test’s code in runTest will work for testing basic suspending functions,
    // and it will automatically skip any delays in coroutines, making the test above complete
    // much faster than one second.
    @Test
    fun dataShouldBeHelloWold() = runTest {
        val data = fetchData()
        assertEquals("Hello world", data)
    }
}
