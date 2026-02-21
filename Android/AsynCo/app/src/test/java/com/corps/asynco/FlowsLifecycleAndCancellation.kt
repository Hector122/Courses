package com.corps.asynco

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.time.Duration.Companion.seconds

class FlowsLifecycleAndCancellation {


    val tickingFlows = flow {
        try {
            repeat(10) {
                emit(it)
                delay(1.seconds)
            }
        } catch (e: Exception) {
            if (e is CancellationException) {
                throw e
            }
            println("Caught: $e")
        } finally {
            println("Collection completed or cancel")
        }
    }

    @Test
    fun check() = runBlocking<Unit> {
        val job = launch {
            tickingFlows
                .onCompletion { println("Follow collection completed") }
                .collect { println(it) }
        }

        delay(4.5.seconds)
        job.cancel()
    }
}
