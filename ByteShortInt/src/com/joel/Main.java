package com.joel;

public class Main {

    public static void main(String[] args) {

        // Integer has a width of 32
        int myMinValue= -2_147_483_648; //number on the right is a literal
        int myMaxValue= 2_147_483_647;
        int myExpression= (2 + 1);// this is an expression
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);


        // byte has a width of 8
        byte myByteValue = -128;
        byte myMaxByte = 127;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = "+ myNewByteValue);


        // short has a width of 16
        short myShortValue = -32768;
        short myNewShortValue = (short) (myShortValue / 2);
        System.out.println("myNewShortValue =" +myNewShortValue);

        // long has width of 64 (double an int)
        long myLongValue = 100L;

        //Challenge:
        // Create a byte variable set to a valid byte number
        // Create a short variable set to a valid short number
        // Create an int variable set to a valid int number
        // Create a new variable type long and make it equal
        // to 50000 + 10 times the sum of my byte, short, and int in challenge

        // Byte
        byte myChallengeByte = 103;
        short myChallengeShortValue = 31104;
        int myChallengeIntValue = 666560;
        long myChallengeLong = (50000) + (10 * (myChallengeByte + myChallengeIntValue + myChallengeShortValue));

        System.out.println("myChallenge Answer is: " + myChallengeLong);
    }
}
