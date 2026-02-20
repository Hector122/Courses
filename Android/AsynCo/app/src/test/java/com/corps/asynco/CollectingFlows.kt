package com.corps.asynco

import android.R
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.toCollection
import kotlinx.coroutines.runBlocking
import org.junit.Test


class CollectingFlows {
    @Test
    fun check() = runBlocking {

        // normal collect
        flowOf(1, 2, 3, 4, 5, 6)
            .onEach { item -> item * 2 }
            .filter { item -> item % 2 == 0 }
            .collect { println(it) }

        // Collect with a method.
        val integers = flowOf(1, 2, 3, 4, 5)
        println("Last item ${integers.last()}")

        // Converse flows value to a list
        val list = mutableListOf<Int>()
        integers.toCollection(list)
        println("Collected List: $list")

    }
}

