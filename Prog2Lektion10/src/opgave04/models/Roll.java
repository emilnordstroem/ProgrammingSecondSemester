package opgave04.models;

import java.util.Random;

public class Roll {
    private int rollCount;
    private int duckPins;
    private int duckPinsKnockedDown;
    private boolean isStrike;
    private boolean isSpare;

    public Roll(int rollCount, int duckPins) {
        this.rollCount = rollCount;
        this.duckPins = duckPins;
    }

    // only for testing purposes
    public Roll(int rollCount, int duckPins, int knockedDockPin, boolean isStrike, boolean isSpare) {
        this.rollCount = rollCount;
        this.duckPins = duckPins;
        this.duckPinsKnockedDown = knockedDockPin;
        this.isStrike = isStrike;
        this.isSpare = isSpare;
    }

    public void rollBowlingBall(){
        duckPinsKnockedDown += new Random().nextInt(0, (duckPins - duckPinsKnockedDown));
        if(duckPinsKnockedDown == 10 && rollCount == 0){
            isStrike = true;
        } else if (duckPinsKnockedDown == 10 && rollCount == 1) {
            isSpare = true;
        }
    }

    public int getDuckPinsKnockedDown() {
        return duckPinsKnockedDown;
    }

    public boolean isStrike() {
        return isStrike;
    }

    public boolean isSpare() {
        return isSpare;
    }

}