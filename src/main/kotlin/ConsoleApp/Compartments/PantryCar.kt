package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_PantryCar

class PantryCar : Coach(), I_PantryCar {
    override fun serverFood(): String {
        return "Serving Food"
    }

    override fun calculateFoodBill(): String {
        return "Food bill generated"
    }

    override fun loadRawMaterials(): String {
        return "Loading raw materials for cooking"
    }

    override fun disposeGarbage(): String {
        return "Dumping garbage from pantry"
    }

    override fun takeFoodOrders(): String {
        return "Taking food order"
    }
}