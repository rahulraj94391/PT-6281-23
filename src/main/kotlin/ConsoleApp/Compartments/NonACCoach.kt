package ConsoleApp.Compartments

abstract class NonACCoach : PassengerCoach() {
    abstract var fan: Boolean
    abstract var windows: Boolean
    fun toggleFan() = !fan
    fun toggleWindows() = !windows
}