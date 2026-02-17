package com.corps.asynco

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.junit.Test

class ColdFlowsExplained {

    @Test
    fun run() = runBlocking {
        val myFlow = flow {
            println("Flow started ...")
            emit(1)
            emit(2)
            emit(3)

//            withContext(Dispatchers.IO) {
//                emit(4)
//            }
        }

        println("Print Before collecting ...")

        myFlow.collect { item ->
            println("Collector #1 $item")
        }

        myFlow.collect { item ->
            println("Collector #2 $item")
        }
    }
}
