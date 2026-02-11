import java.util.Locale
import java.util.Locale.getDefault

class Fish(var name: String)


fun fishExample() {
    val fish = Fish("macumba")
    myWith(fish.name) {

        println(uppercase(getDefault()))
    }

    //run: takes one argument and return the result o the execution lambda
    println(fish.run { this.name })

    //Apply: same as run but return  the object fun's apply to.
    println(fish.apply {})

    val fish2: Fish = Fish(name = "splashy").apply { this.name = "Sharky" }
    println(fish2.name)

    //Let: let return a copy of changed object.
    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { +31 })

    //With inline no object is created, and lambda body is inline here.
    fish.name.capitalize()

    // Without inline a object is created every call to myWith
    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}


fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.divideBy { it.rem(3) })

    //Should return

    var lambda: (String) -> Int = { it.length }
}

// inline keyword
inline fun myWithInLine(name: String, block: String.() -> Unit) {
    name.block()
}


/*
Practice Time
Create an extension on List using a higher order function that returns all the numbers in the list that are divisible by 3.
Start by creating an extension function on List that takes
an lambda on Int and applies it to each item in the list. When the lambda returns zero, include
the item in the output. For example, this list:

 [3, 6, 9, 0]
 */


fun List<Int>.divideBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()

    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }

    return result
}
