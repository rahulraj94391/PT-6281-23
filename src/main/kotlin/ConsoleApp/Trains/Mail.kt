package ConsoleApplication.Trains

import ConsoleApp.Interfaces.Mail

class Mail(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats), Mail {

}

