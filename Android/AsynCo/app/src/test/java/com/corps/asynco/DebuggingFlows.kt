package com.corps.asynco

import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.test.runTest
import org.junit.Test

class DebuggingFlows {
    private val number = flow {
        emit(1)
        emit(2)
        emit(3)
        emit(4)
        throw NumberFormatException()
        emit(5)
    }

    @Test
    fun check() = runTest {
        number.onStart { println("Flow Started") }
            .map { println("Mapping $it"); it * 2 }
            .filter { println("Filtering $it"); it % 3 == 0 }
            .onEach { println("Before collecting: $it") }
            .catch { println("Caught $it") }
            .onCompletion { println("Completed emissions with $it") }
            .collect { println("Collected: $it") }
    }
}
