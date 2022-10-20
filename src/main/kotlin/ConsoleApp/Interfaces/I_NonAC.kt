package ConsoleApp.Interfaces

interface I_NonAC {
    var fan: Boolean
    var windows: Boolean
    fun toggleFan() = !fan
    fun toggleWindows() = !windows
}