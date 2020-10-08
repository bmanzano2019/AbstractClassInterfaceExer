import poultry.Chicken;
import poultry.Cock;
import poultry.Hen;
import transportation.Airplane;
import transportation.Bus;
import transportation.MyCar;
import transportation.Train;

import java.util.Random;

public class Main {
    public static void main (String[] args) {
        // Problem 1
        performSolutionToFirstProblem();
        // Problem 2
        performSolutionToSecondProblem();
    }

    private static void performSolutionToFirstProblem() {
        // One cock sells 5 yuan, one hen 3 yuan, and one yuan for three chickens. If you want to buy 100 of them with 100 yuan, how should you buy them?
        // Basis of solution taken from Hundred Fowls Problem, https://en.wikipedia.org/wiki/Hundred_Fowls_Problem
        System.out.println("problem 1");

        Cock cock = new Cock();
        Hen hen = new Hen();
        Chicken chicken = new Chicken();

        // assign random variable between 0 to 3
        int randomVar = (new Random()).nextInt(3);

        System.out.println("buy " + cock.buyPoultryPortion(randomVar) + " cocks");
        System.out.println("buy " + hen.buyPoultryPortion(randomVar) + " hens");
        System.out.println("buy " + chicken.buyPoultryPortion(randomVar) + " chickens");
    }

    private static void performSolutionToSecondProblem() {
        /*
        From Wuhan to Beijing you can choose from 4 means of transportation,
        including driving a car, taking bus, train, or plane.
        Driving costs 500 yuan, bus 300 yuan, train 400 yuan, and plane 1000 yuan.
        With the budget of 500 yuan, which vehicles Xiaoming can choose to get there?
         */
        System.out.println("problem 2");

        int funds = 500;

        MyCar car = new MyCar();
        Bus bus = new Bus();
        Train train = new Train();
        Airplane plane = new Airplane();

        if (funds >= car.getTransportationFee()) {
            System.out.println("with " + funds + ", can travel by car");
        }
        if (funds >= bus.getTransportationFee()) {
            System.out.println("with " + funds + ", can travel by bus");
        }
        if (funds >= train.getTransportationFee()) {
            System.out.println("with " + funds + ", can travel by train");
        }
        if (funds >= plane.getTransportationFee()) {
            System.out.println("with " + funds + ", can travel by plane");
        }

    }

}
