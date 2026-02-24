package com.corps.asynco

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking
import org.junit.Test

class CombiningFlows {

    private val number = listOf(1,2,3).asFlow()
        .onEach { delay(300) }

    private val letter = flowOf("A", "B", "C", "D")
        .onEach { delay(1300) }

    @Test
    fun check() = runBlocking {

        println("Using zip")
        number.zip(letter) { number, letter ->
            "$number$letter"
        }.collect {
            println(it)
        }


        println("Using combine")
        combine(number, letter){ number, letter ->
            "$number$letter"
        }.collect { println(it) }
    }
}
