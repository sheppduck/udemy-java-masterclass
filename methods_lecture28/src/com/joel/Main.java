package com.joel;

public class Main {

    public static void main(String[] args) {

        calculateScore(false, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("From calculateScore: Your final score was " + finalScore);
            return finalScore;
        }   else {
            int youLose = -1;
            System.out.println("If we got here: " + youLose);
            return youLose;
        }



    }



//       ##################################
//       Challenge
//       ##################################
//       how would you return a -1 if gameOver was set to false?

}


