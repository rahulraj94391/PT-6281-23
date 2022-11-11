package ConsoleApp

import kotlin.properties.Delegates

class Validator {
    private var changing: String = "NotSet"
    fun getIntegerInput(range: IntRange): Int {
        print("Enter choice: ")
        var n by Delegates.notNull<Int>()
        var flag = true
        while (flag) {
            try {
                n = readln().toInt()
                if (n in range) flag = false
                else println("### Enter correct input ###")
            } catch (e: Exception) {
                println("### Enter integer value only ###")
            }
        }
        return n
    }

    fun getValidAgeInput(): Int {
        var age by Delegates.notNull<Int>()
        var flag = true
        while (flag) {
            try {
                print("Enter age: ")
                age = readln().toInt()
                if (age in 10..100) flag = false
                else println("### Enter age between 10 and 100 ###")
            } catch (e: Exception) {
                println("### Enter integer value only ###")
            }
        }
        return age
    }

    fun getValidNameInput(): String {
        print("Enter name: ")
        var name: String = readln()
        while (!name.isCorrectNameFormat()) {
            println("### Name can't contain digits and length should be < 20 characters ###")
            print("Enter name correctly: ")
            name = readln()
        }
        return name
    }

    private fun String.isCorrectNameFormat(): Boolean {
        if (this.length > 20) return false
        for (cc in this) {
            if (!(cc.isLetter() || cc == ' ')) {
                return false
            }
        }
        return true
    }

    fun getValidNoOfTravellersInput(): Int {
        // on a single ticket maximum 6 person can travel
        var travellers by Delegates.notNull<Int>()
        var flag = true
        while (flag) {
            try {
                print("Enter no of travellers: ")
                travellers = readln().toInt()
                if (travellers in 1..6) flag = false
                else println("### At max 6 travellers can be booked on a ticket ###")
            } catch (e: Exception) {
                println("### Enter integer value only ###")
            }
        }
        return travellers
    }
}
