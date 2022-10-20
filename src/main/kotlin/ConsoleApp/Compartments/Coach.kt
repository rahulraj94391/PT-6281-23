package ConsoleApp.Compartments

abstract class Coach() {
    open val totalCapacity: Int = 0
    var lights: Boolean = false

    fun toggleLight() {
        !lights
    }
}