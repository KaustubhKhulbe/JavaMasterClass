package com.company;

public class MethodsChallenge {

    public static void main(String[] args) {
	// write your code here

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bob", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " got " + position + " on the leaderboard!");
    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;

        if(playerScore >= 1000) position = 1;
        else if(playerScore >= 500) position = 2;
        else if(playerScore >= 100) position = 3;
        return 4;

    }
}
