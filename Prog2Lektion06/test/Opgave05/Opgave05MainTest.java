package Opgave05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Opgave05.Opgave05Main.sfd;
import static org.junit.jupiter.api.Assertions.*;

public class Opgave05MainTest {

    @Test
    @DisplayName("sfd(2, 2)")
    public void sfd2And2shouldbe2() {
        int actual = sfd(2, 2);
        assertEquals(2, actual);
    }

    @Test
    @DisplayName("sfd(21, 49)")
    public void sfd21And49ShouldBe7() {
        int actual = sfd(21, 49);
        assertEquals(7, actual);
    }
}