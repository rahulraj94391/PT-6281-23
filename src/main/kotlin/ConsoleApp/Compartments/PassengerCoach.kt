package ConsoleApp.Compartments

abstract class PassengerCoach() : Coach() {
    abstract val totalCapacity: Int
    var readingLights: Boolean = false
    abstract var currentCapability: Int

    fun toggleReadingLights() {
        !readingLights
    }
}