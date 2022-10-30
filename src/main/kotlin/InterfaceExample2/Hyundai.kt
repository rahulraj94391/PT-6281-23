package InterfaceExample2

class Hyundai() : Cars(), LocationService {
    override fun Wheel(): String = "Hyundai is a 4 wheeler car"
    override fun CheckAC(): String = "AC is available in Hyundai"
    override fun CallFacility(): String = "Call Facility supported is available"
    override fun GPS() = println("Navigation feature is available on Hyundai")
}
