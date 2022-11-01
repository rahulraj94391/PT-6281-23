package InterfaceExample3

//base interface1
internal interface Moveable {
    fun run()
}

//base interface2
internal interface Speakable {
    fun speak()
}

//child interface inheriting two base interfaces
internal interface Ability : Moveable, Speakable {
    fun show()
}

internal class Person : Ability {
    override fun run() {
        println("I can run !!")
    }

    override fun speak() {
        println("I can speak !!")
    }

    override fun show() {
        println("I am a person, I can speak and run !!")
    }
}


fun main() {
    val obj = Person()
    obj.run()
    obj.speak()
    obj.show()
}
