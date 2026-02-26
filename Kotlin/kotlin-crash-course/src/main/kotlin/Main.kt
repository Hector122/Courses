package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Print enter a number: ")
    val input = readln()
    val inputAsInteger = input.toInt()

    val isEvenNumber = inputAsInteger % 2 == 0
    println("Is even number? $isEvenNumber")
}