package Opgave03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Opgave03.Opgave03Main.power;
import static org.junit.jupiter.api.Assertions.*;

public class Opgave03MainTest {
    @Test
    @DisplayName("power(3, 0)")
    void powerThreeToTheZeroShouldBeOne() {
        int actual = power(3, 0);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("power(3, 5)")
    void powerThreeToTheFiveShouldBe243() {
        int actual = power(3, 5);
        assertEquals(243, actual);
    }
}