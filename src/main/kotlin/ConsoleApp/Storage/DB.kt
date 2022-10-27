package ConsoleApp.Storage

import ConsoleApp.Trains.*
import ConsoleApp.User

object DB {
    var listOfTrains: MutableList<Train> = mutableListOf()
    var mapOfUsers: MutableMap<String/*(userID)*/, User> = mutableMapOf()

    init {
        addTrains()
        addUsers()
    }

    private fun addTrains() {
        listOfTrains.add(SFMail("CSMT MS SF MAIL", 22157, Routes.route22157, 2))
        listOfTrains.add(Express("CSMT CHENNAI EX", 22159, Routes.route22159, 2))
        listOfTrains.add(Mail("CHENNAI MAIL", 12658, Routes.route12658, 2))
        listOfTrains.add(Rajdhani("MAS NZM RAJDHANI", 12433, Routes.route12433, 2))
    }

    private fun addUsers() {
        mapOfUsers["rahulraj94391"] = User("rahulraj94391", "Rahul Raj", 22, 'M')
        mapOfUsers["tarunkumar94391"] = User("tarunkumar94391", "Tarun Kumar", 22, 'M')
    }
}