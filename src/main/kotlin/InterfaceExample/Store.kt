package InterfaceExample

class VehicleRentalStore(ownerName: String, phoneNumber: String) {
    var owner: String private set
    var phoneNumber: String private set
    private val motorbikes: MutableList<TwoWheelerWithEngine> = mutableListOf()
    private val cycle: MutableList<TwoWheelerWithoutEngine> = mutableListOf()
    private val cars: MutableList<FourWheeler> = mutableListOf()
    private val motorVehicles: MutableList<IEngine> = mutableListOf()

    init {
        this.owner = ownerName
        this.phoneNumber = phoneNumber
        addCycle()
        addCars()
        addMotorBikes()
        motorVehicles.addAll(this.cars)
        motorVehicles.addAll(this.motorbikes)
        showWelcomeMessage()
    }

    private fun addCycle() {
        cycle.add(AtlasCycle("ORANGE"))
        cycle.add(AtlasCycle("BLUE"))
    }

    private fun addMotorBikes() {
        motorbikes.add(HeroSplendor("ORANGE"))
        motorbikes.add(HeroSplendor("BLACK"))
    }

    /**
     * A group of *members*.
     *
     * This class has no useful logic;
     * it's just a documentation example.
     *
     * @param
     * @property name the name of this group.
     * @constructor Creates an empty group.
     */
    private fun addCars() {
        cars.add(ToyotaFortuner("BLACK"))
        cars.add(ToyotaFortuner("RED"))
        cars.add(HondaCity("MAROON"))
    }

    private fun showWelcomeMessage() {
        println("****** Welcome to $owner Vehicle Rental ******")
    }

    fun showMotorVehicleMenu() {
        println("<-------- Available motor vehicle(s) -------->")
        println(java.lang.String.format("%15s %10s %10s", "Manufacturer", "Model", "Color"))
        for (vehicle in motorVehicles) {
            if (vehicle is FourWheeler) {
                println(java.lang.String.format("%15s %10s %10s", vehicle.manufacturer, vehicle.modelNo, vehicle.color))
            } else if (vehicle is TwoWheelerWithEngine) {
                println(java.lang.String.format("%15s %10s %10s", vehicle.manufacturer, vehicle.modelNo, vehicle.color))
            }
        }
    }

    fun showNonMotorVehicleMenu() {
        println("<-------- Available non-motor vehicle(s) -------->")
        println(java.lang.String.format("%15s %10s %10s", "Manufacturer", "Model", "Color"))
        for (vehicle in cycle) {
            println(java.lang.String.format("%15s %10s %10s", vehicle.manufacturer, vehicle.modelNo, vehicle.color))
        }
    }

    fun startEngine(i: IEngine) {

    }

}