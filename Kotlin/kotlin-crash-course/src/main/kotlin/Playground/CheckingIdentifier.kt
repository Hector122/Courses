//package org.example.Playground

/*
Checking identifier
Implement the function that checks whether a string is a valid identifier.
A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters,
digits and underscores.
 */

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty()) return false
    if (!(s[0].isLetter() || s[0] == '_')) return false

    for (char in s) {
        if (!(char.isLetterOrDigit() || char == '_')) return false

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
