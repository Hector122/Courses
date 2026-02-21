package com.corps.asynco

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.time.Duration.Companion.seconds

class FlowTransformations {

    val flow = flowOf(1, 2, 3, 4)
        .onEach {
            delay(1.seconds)
            println("Processing $it")
        }
        .filter {
            println("Flow is filtering")
            it != 4
        }
        .onStart { println("Flow is starting") }


    @Test
    fun check() = runTest {
        flow.collect { println("Collector #$it") }
    }
}
