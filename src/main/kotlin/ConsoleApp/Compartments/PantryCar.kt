package ConsoleApp.Compartments

class PantryCar : Coach() {
    fun serverFood(): String {
        return "Serving Food"
    }

    fun calculateFoodBill(): String {
        return "Food bill generated"
    }

    fun loadRawMaterials(): String {
        return "Loading raw materials for cooking"
    }

    fun disposeGarbage(): String {
        return "Dumping garbage from pantry"
    }

    fun takeFoodOrders(): String {
        return "Taking food order"
    }
}