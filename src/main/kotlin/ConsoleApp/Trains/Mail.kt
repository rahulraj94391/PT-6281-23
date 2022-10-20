package ConsoleApp.Trains

import ConsoleApp.Interfaces.I_Mail

class Mail(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats), I_Mail {
    override fun averageSpeed(): Int {
        return avgSpeed
    }

    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun hasPantyCar(): Boolean {
        return true
    }



}

