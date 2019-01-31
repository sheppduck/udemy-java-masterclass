package com.joel;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int newScore = 10000;
        int level2Completed = 8;
        int newBonus = 200;

        /*if (score == 5000) {
            System.out.println("Your score was 5000!!");
            System.out.println("This was executed!");
        }
*/
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 - but greater than 1000!!");
//        }
//        else if(score < 1000) {
//            System.out.println("Your score was less than 1000, sorry!");
//
//        }
//        else {
//            System.out.println("Got here...");
//        }


        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

//        //You can also just do
//        if (gameOver) {
//            int...
//        }
       //this  is the same as the == true example

        // Challenge Code

        if (gameOver == true) {
            int finalScore2 = newScore + (level2Completed * newBonus);
            System.out.println("Challenge: Score 2 was: " + finalScore2);
        }
//
//
//       ##################################
//       Challenge
//       Print out a second score on the screen
//       with the following
//       score set to 10000
//       levelCompleted set to 8
//       bonus set to 200
//       make sure the first printout above also displays
//       ###################################






    }
}