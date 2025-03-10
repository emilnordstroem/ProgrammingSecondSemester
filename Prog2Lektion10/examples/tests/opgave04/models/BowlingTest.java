package opgave04.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingTest {
    private Bowling bowling;

    @BeforeEach
    void setUp() {
        bowling = new Bowling(10, 10); // 10 frames, max 10 pins per roll
    }

    @Test
    void playRounds() {
        Roll roll1 = new Roll(1, 10, 10, true, false);

        bowling.playRounds();

        assertEquals(10, bowling.getTotalScore());
    }
}