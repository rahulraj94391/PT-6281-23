package InterfaceExample

abstract class TwoWheelerWithEngine : IMoveable, IEngine {
    abstract var manufacturer: String protected set
    abstract var modelNo: String protected set
    abstract var color: String protected set
    abstract var price: Double protected set

    open fun wheel() {
        println("2 wheeler")
    }

    fun specification() {
        println(
            "Manufacturer -> $manufacturer\n" +
                    "Model Number -> $modelNo\n" +
                    "Colour -> $color\n" +
                    "Price is $price.\n"
        )
    }

}