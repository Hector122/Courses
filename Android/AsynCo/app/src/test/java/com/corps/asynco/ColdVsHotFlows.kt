package com.corps.asynco

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.time.Duration.Companion.seconds

class ColdVsHotFlows {
    val coldFlow = flow {
        println("Cold flow started")
        emit("A")
        emit("B")
        delay(1.seconds)
        emit("C")
    }

    val hotFlow = MutableSharedFlow<String>()

    @Test
    fun check() = runTest {
        launch {
            coldFlow.collect {
                println("Collector #1 got $it")
            }
        }
        launch {
            coldFlow.collect {
                println("Collector #2 got $it")
            }
        }

        delay(2.seconds)
        println("Going to work with the hot flow")
        println("Emitting an item in the hot flow")

        hotFlow.emit("Hot emission")

        println("An item has been emitted")

        launch {
            hotFlow.collect {
                println("Hot flow Collector has got: $it")
            }
        }

        delay(1.seconds)
        hotFlow.emit("New item has been emitted")
        hotFlow.emit("Another newØ item has been emitted")
    }
}
