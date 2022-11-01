package behavioral.state

/**
 * Common interface for all states.
 */
interface State {
    fun doAction(context: Context)
}

/**
 * Use the Context to see change in behaviour when State changes.
 */
class Context{
     var state: State? = null

//    fun setState(state: State?) {
//        this._state = state
//    }
//
//    fun getState(): State? {
//        return _state
//    }
}

/**
 * Concrete states provide the special implementation for all interface methods.
 */
open class Starts: State {
    override fun doAction(context: Context) {
        println("Player is start state")
        context.state = this
    }

    override fun toString(): String {
        return "Start State"
    }
}

open class Stop: State{
    override fun doAction(context: Context) {
        println("Player is in stop state")
        context.state = this
    }
    override fun toString(): String {
        return "Stop State"
    }
}