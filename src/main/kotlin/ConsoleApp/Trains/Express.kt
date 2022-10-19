package ConsoleApplication.Trains

import ConsoleApp.Interfaces.Express

class Express(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats), Express {
}