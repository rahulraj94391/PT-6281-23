package ConsoleApplication.Trains

import ConsoleApplication.Interfaces.Rajdhani

class Rajdhani(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats), Rajdhani {

    }