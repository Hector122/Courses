package com.corps.asynco

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.junit.Test

class FlatteringFlows {


    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun check() = runTest {
        (1..3).asFlow()
            .onEach { delay(400) }
//            .flatMapLatest { lettersFor("[$it]") }
 //           .flatMapConcat { lettersFor("[$it]") }
            .flatMapMerge { lettersFor("[$it]") }
            .collect { value ->
                println(value)
            }

    }

    private fun lettersFor(prefix: String) = flow {
        for (letter in listOf("A", "B", "C")) {
            emit("$prefix $letter")
            delay(300)
        }
    }
}
