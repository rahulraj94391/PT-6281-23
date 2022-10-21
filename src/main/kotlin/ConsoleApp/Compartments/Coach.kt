package ConsoleApp.Compartments

abstract class Coach() {
    protected var coachPosition: String = "NOT_SET"
    protected var lights: Boolean = false

    fun toggleLight() {
        !lights
    }
}