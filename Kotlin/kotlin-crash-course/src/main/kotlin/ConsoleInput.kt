package org.example

fun main(){
    println("Print enter a number: ")
    val input = readln()
    val inputAsInteger = input.toInt()

    val isEvenNumber = inputAsInteger % 2 == 0
    println("Is even number? $isEvenNumber")
}