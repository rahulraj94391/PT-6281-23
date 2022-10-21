package ConsoleApp.Interfaces

interface I_PantryCar {
    fun serverFood() : String
    fun calculateFoodBill() : String
    fun loadRawMaterials() : String
    fun disposeGarbage() : String
    fun takeFoodOrders() : String
}