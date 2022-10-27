package ConsoleApp.Compartments

abstract class ACCoach: PassengerCoach() {
    open var temperature: Int = 27
    fun incrementTemp() = temperature++
    fun decrementTemp() = temperature--
}