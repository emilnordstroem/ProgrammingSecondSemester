package opgave03;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void add() {
        List list = new List();
        list.add("Tiger");
        list.add("Bird");
        list.add("Lion");
        list.add("Dog");
        list.add("Elefant");
        list.add("Panda");
        list.add("Panda");
        assertEquals(6, list.getSize());
    }

    @Test
    void remove() {
        List list = new List();
        list.add("Tiger");
        list.add("Bird");
        list.add("Lion");
        list.add("Dog");
        list.add("Elefant");
        list.remove(3);
        assertEquals(4, list.getSize());
    }

    @Test
    void getRecentlyUsed() {
        List list = new List();
        list.add("Tiger");
        list.add("Bird");
        list.add("Lion");
        list.add("Dog");
        list.add("Elefant");
        String[] recentlyUsed = list.getRecentlyUsed();
        for(String string : recentlyUsed){
            System.out.println(string);
        }
    }
}