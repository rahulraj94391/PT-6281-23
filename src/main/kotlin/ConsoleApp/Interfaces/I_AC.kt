package ConsoleApp.Interfaces

interface I_AC {
    var temperature: Int
    fun incrementTemp() = temperature++
    fun decrementTemp() = temperature--
}