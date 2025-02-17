package Opgave04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Opgave04.Opgave04Main.reverse;
import static org.junit.jupiter.api.Assertions.*;

public class Opgave04MainTest {
    @Test
    @DisplayName("reverse(\"\")")
    public void reverseEmptyStringShouldReturnEmptyString() {
        String actual = reverse("");
        assertEquals("", actual);
    }

    @Test
    @DisplayName("reverse(\"\")")
    public void reverseShouldReturnReversedString() {
        String actual = reverse("eirefretniV");
        assertEquals("Vinterferie", actual);
    }
}