package InterfaceExample

abstract class FourWheeler() : IMoveable, IEngine {
    abstract var manufacturer: String protected set
    abstract var modelNo: String protected set
    abstract var color: String protected set
    abstract var hasAC: Boolean protected set
    abstract var price: Double protected set

    fun Wheel() {
        println("$manufacturer $modelNo has 4 wheels.")
    }

    fun specification() {
        println(
            "Manufacturer -> $manufacturer\n" +
                    "Model Number -> $modelNo\n" +
                    "Colour -> $color\n" +
                    "AC is " + (if (hasAC) "" else "not ") + "available.\n" +
                    "Price is $price.\n"
        )
    }

    abstract fun CheckAC()

    abstract fun CallFacility()


}