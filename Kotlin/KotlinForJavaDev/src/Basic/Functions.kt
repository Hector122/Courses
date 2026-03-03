package Basic

//Top level function:
fun topLovel() = 1

class Functions {
    //Member functions
    fun member() = 2

    //Local functions:
    fun other() {
        fun local() = 3
    }


    //Functions: Default Arguments
    fun displaySeparator(character: Char = '*', size: Int = 10) {
        repeat(size) {
            print(character)
        }
    }

    fun main() {
        //displaySeparator(3, '5') The CODE Won't compile'
        displaySeparator()
    }
}




