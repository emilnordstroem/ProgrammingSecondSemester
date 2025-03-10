package opgave04.models;

import java.util.Random;

public class Bowling {
    private int roundLimit;
    private int duckPinLimit;
    private int[] scoreBoard;

    public Bowling(int roundLimit, int duckPinLimit) {
        this.roundLimit = roundLimit;
        this.duckPinLimit = duckPinLimit;
        this.scoreBoard = new int[roundLimit];
    }

    public void playRounds(){
        Roll[] rolls = new Roll[roundLimit * 2];
        int[] results = new int[roundLimit * 2];

        int rollIndex = 0;

        for (int round = 0; round < roundLimit; round++) {
            Roll firstRoll = new Roll(0, duckPinLimit);
            firstRoll.rollBowlingBall();
            results[rollIndex] = firstRoll.getDuckPinsKnockedDown();
            rolls[rollIndex] = firstRoll;
            rollIndex++;

            // First roll did not result in a strike
            if (!firstRoll.isStrike()) {
                Roll secondRoll = new Roll(1, duckPinLimit - firstRoll.getDuckPinsKnockedDown());
                secondRoll.rollBowlingBall();
                results[rollIndex] = secondRoll.getDuckPinsKnockedDown();
                rolls[rollIndex] = secondRoll;
                rollIndex++;
            }
        }

        calculateScore(rolls, results);
    }

    private void calculateScore(Roll[] rolls, int[] results){
        int totalScore = 0;
        int rollIndex = 0;

        for (int frame = 0; frame < roundLimit; frame++) {
            int frameScore = results[rollIndex] + results[rollIndex + 1];

            if (rolls[rollIndex].isStrike()) {
                frameScore = 10 + results[rollIndex + 1] + results[rollIndex + 2];
                rollIndex++;
            } else if (rolls[rollIndex + 1].isSpare()) {
                frameScore = 10 + results[rollIndex + 2];
                rollIndex += 2;
            } else {
                rollIndex += 2;
            }

            scoreBoard[frame] = frameScore;
            totalScore += frameScore;
        }
    }

    public int getTotalScore() {
        int result = 0;
        for(int score : scoreBoard){
            result += score;
        }
        return result;
    }

    public void printScoreBoard(){
        for(int score : scoreBoard){
            System.out.print(score + ", ");
        }
    }
}