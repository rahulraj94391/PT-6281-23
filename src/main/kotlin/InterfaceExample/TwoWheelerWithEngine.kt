package InterfaceExample

abstract class TwoWheelerWithEngine() : IMoveable, IEngine {
    abstract var manufacturer: String protected set
    abstract var modelNo: String protected set
    abstract var color: String protected set
    abstract var price: Double protected set


    open fun Wheel(): String {
        return "2 wheeler"
    }

    open fun CallFacility(): String {
        return "Call two wheeler Facility supported"
    }
}