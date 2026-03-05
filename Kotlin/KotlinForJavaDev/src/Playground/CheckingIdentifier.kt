package Playground//package org.example.Playground

/*
Checking identifier
Implement the function that checks whether a string is a valid identifier.
A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters,
digits and underscores.
 */

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || s[0].isDigit()) return false

    fun isValidCharacter(ch: Char) = ch == '_' || ch.isLetterOrDigit()

    for (char in s) {
        if (!isValidCharacter(char)) return false
    }

    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
