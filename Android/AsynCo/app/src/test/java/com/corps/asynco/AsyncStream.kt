package com.corps.asynco

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.time.Duration.Companion.seconds

class AsyncStream {

    @Test
    fun run() = runBlocking {
        val job = launch {
            tickerFlow().collect { tick ->
                println("Tick $tick")
            }
        }

        delay(10.seconds)
        job.cancel()

    }

    private fun tickerFlow(): Flow<Long> = flow {
        while (true) {
            emit(System.currentTimeMillis())
            delay(1.seconds)
        }
    }
}
