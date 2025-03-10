package opgave04.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollTest {

    @Test
    void rollBowlingBall() {
        Roll roll1 = new Roll(1, 10);
        roll1.rollBowlingBall();
    }
}