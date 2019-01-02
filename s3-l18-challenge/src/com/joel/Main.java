package com.joel;

public class Main {

    public static void main(String[] args) {
        //create a variable to store number of pounds
        double myPoundsValue = 10d;
        // create a variable to store what a kilo is compared to pounds
        double myKiloVar = 0.45359237d;
        // create a var for the conversion
        double myChallenge = myKiloVar * myPoundsValue;
        // print it out
        System.out.println("myChallange answer is: " + myChallenge);

    }
}
