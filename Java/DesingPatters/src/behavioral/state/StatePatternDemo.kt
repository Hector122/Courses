package behavioral.state


fun main() {
    val context = Context()

    val starts: Starts = Starts()
    starts.doAction(context)

    println(context.state.toString())


    val stop = Stop()
    stop.doAction(context)

    println(context.state.toString())
}