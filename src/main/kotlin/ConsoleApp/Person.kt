package ConsoleApplication

data class Person(var fullName: String, var age: Int, var ID: String) {
    override fun toString(): String {
        return "$fullName       $age       $ID"
    }
}