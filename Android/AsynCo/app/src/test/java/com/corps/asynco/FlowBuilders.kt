package com.corps.asynco

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import org.junit.Test

class FlowBuilders {

    @Test
    fun check() {
        // Flows builders are cold flow, need collector to beaning emit values.

        // this can have code inside
        val flowOfInts = flow {
            val number = 12 * 46
            emit(number)
            emit(2)
        }

        // only for declaration
        val flowOfString = flowOf("a", "b", "c")

        val emptyFlow: Flow<Boolean> = emptyFlow()

        val flowOfNames = listOf("Maria", "Patria", "Minerva")
    }
}
