fun main() {

    //val and var

    var variable = "Something"
    variable = "another Value"
    val value = variable

    println(value)


    val list = listOf<String>("a", "b")
    //list.add() can't be doing

    val list2 = mutableListOf<String>("a", "b", "c")
    list2.add("d")
}