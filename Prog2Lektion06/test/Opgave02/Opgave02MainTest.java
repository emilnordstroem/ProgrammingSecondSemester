package Opgave02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Opgave02.Opgave02Main.fibonacci;
import static org.junit.jupiter.api.Assertions.*;

public class Opgave02MainTest {

    @Test
    @DisplayName("fibonacci(0)")
    void fibonacciZeroShouldBeZero() {
        int actual = fibonacci(0);
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("fibonacci(1)")
    void fibonacciOneShouldBeOne() {
        int actual = fibonacci(1);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("fibonacci(10)")
    void fibonacciTenShouldBe55() {
        int actual = fibonacci(10);
        assertEquals(55, actual);
    }

}