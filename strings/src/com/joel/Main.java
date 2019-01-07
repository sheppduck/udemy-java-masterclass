package com.joel;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to: " +myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to: " + myString);

        // Below is string only, no math no calcs
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to: " + lastString);


    }
}

//Data Types:
//primitive types:
//byte
//short
//int
//long
//float
//double
//char
//boolean

//Objects are also data types...  Classes but later

//strings are sequences of chars....

