package ConsoleApp.Compartments

class SL() : NonACCoach(){
    override val totalCapacity: Int = 80
    override var currentCapacity: Int = totalCapacity
    override var fan: Boolean = false
    override var windows: Boolean = true
}