package InterfaceExample

abstract class TwoWheelerWithoutEngine : IMoveable {
    abstract var manufacturer: String protected set
    abstract var modelNo: String protected set
    abstract var color: String protected set
    abstract var price: Double protected set
}