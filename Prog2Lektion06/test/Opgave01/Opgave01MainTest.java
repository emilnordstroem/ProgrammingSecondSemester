package Opgave01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Opgave01.Opgave01Main.factorial;
import static org.junit.jupiter.api.Assertions.*;

public class Opgave01MainTest {

    @Test
    @DisplayName("Factorial(0)")
    void factorialZeroShouldBeOne() {
        int actual = factorial(0);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Factorial(5)")
    void factorialFiveShouldBe120() {
        int actual = factorial(5);
        assertEquals(120, actual);
    }
}