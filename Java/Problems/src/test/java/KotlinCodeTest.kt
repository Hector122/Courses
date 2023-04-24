import kotlinx.coroutines.*




fun main() = runBlocking {
    val task = GlobalScope.launch {
        delay(1000L)
        println("there")
    }
    println("Hello,")
    task.join() // wait for the coroutine to complete
}
/**--------*/
//fun main() {
//    val y = arrayOf(10, 20, 30, 40)
//    val z = listOf(10, 20, 30, 40)
//
//    println("Original values:")
//    println("y: ${y.joinToString(", ")}") // joinToString is used to print array elements as comma-separated string
//    println("z: ${z.joinToString(", ")}")
//
//    y[2] = 35 // modify the third element of y
//    // z[2] = 35 // This would cause a compile-time error, as List doesn't support modification of elements.
//
//    val z2 = z.map { it + 5 } // create a new List by adding 5 to each element of z
//
//    println("Modified values:")
//    println("y: ${y.joinToString(", ")}")
//    println("z: ${z.joinToString(", ")}")
//    println("z2: ${z2.joinToString(", ")}")
//}

/**--------*/
//abstract class Aircraft {
//    init { println("Aircraft = ${getName()}")
//
//        getName()
//    }
//    abstract fun getName(): String
//}
//class Airplane(private val name: String) : Aircraft() {
//    override fun getName(): String = name
//}
//
//fun main(){
//    val obj = Airplane("C130")
//
//    fun String.prueba(): Int =  this.length
//}


//fun main() = runBlocking {
//    val job = launch {
//        repeat(1000) { i ->
//            println("job: I'm sleeping $i ...")
//            delay(500L)
//        }
//    }
//    delay(1300L) // delay a bit
//    println("main: I'm tired of waiting!")
//    job.cancel() // cancels the job
//    job.join() // waits for job's completion
//    println("main: Now I can quit.")
//}


/**--------*/
//fun ArrayChallenge(arr: Array<Int>): String {
//    // code goes here
//
//    //find the max
//    val max = arr.maxOrNull()?: 0
//    val sum = arr.filter {it != max }.sum()
//
//    if(sum == max) return "true"
//
//    // two pointer
//    for(i in 0 until arr.size -1){
//        for(j in i + 1 until arr.size){
//            val oneSum = arr[i] + arr[j]
//            if(oneSum == max) return "true"
//            else if(sum - arr[i] - arr[j] + max == max) return "true"
//        }
//    }
//    return "false";
//}
//
//fun main() {
//    println(ArrayChallenge(arrayOf(4, 6, 23, 10, 1, 3)))
//}


/**----------*/
//data class Point(val x: Int, val y: Int)
//operator fun Point.plus(other: Point) = Point(x + other.x, y + other.y)
//infix operator fun Point.minus(other: Point) = Point(x - other.x, y - other.y)

//fun main() {
//    val point1 = Point(10, 20)
//    val point2 = Point(20, 30)
//    println(point1 + point2)
//    println(point1 - point2)
//}


/**--------*/



//class InitOrderDemo(name: String) {
//    val firstProperty = "First property: $name".also(::println)
//
//    init {
//        println("First initializer block that prints $name")
//    }
//
//    val secondProperty = "Second property: ${name.length}".also(::println)
//
//    fun get() = "this is the $name"
//    init {
//        println("Second initializer block that prints ${name.length}")
//    }
//}
//
//fun main() {
//    InitOrderDemo("hello")
//}
