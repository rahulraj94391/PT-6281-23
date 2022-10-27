package ConsoleApp.Compartments

class GN() : NonACCoach() {
    override val totalCapacity: Int = 100
    override var currentCapacity: Int = totalCapacity
    override var fan: Boolean = false
    override var windows: Boolean = true
}