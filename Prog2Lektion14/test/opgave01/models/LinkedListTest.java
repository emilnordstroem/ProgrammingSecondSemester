package opgave01.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList<String> integerList;

    @BeforeEach
    void constructIntegerList(){
        integerList = new LinkedList<>();
    }

    @Test
    void add() {
        integerList.add("BMW");
        integerList.add("Mercedes");
        int actualResult = integerList.size;
        assertEquals(2, actualResult);
    }

    @Test
    void remove() {
        integerList.add("Cadillac");
        integerList.add("Cadillac");

        integerList.remove("Cadillac");

        int actualResult = integerList.size();
        assertEquals(0, actualResult);
    }

    @Test
    void addFirst() {
        integerList.addFirst("Tesla");
        int actualResult = integerList.size;
        assertEquals(1, actualResult);
    }

    @Test
    void getFirst() {
        integerList.add("Honda");
        String actualResult = integerList.getFirst();
        assertEquals("Honda", actualResult);
    }

    @Test
    void removeFirst() {
        integerList.add("BMW");
        integerList.add("Mercedes");
        integerList.add("Cadillac");

        integerList.removeFirst();
        String actualResult = integerList.getFirst();

        assertEquals("Mercedes", actualResult);
    }

    @Test
    void contains() {
        integerList.add("BMW");
        integerList.add("Mercedes");
        integerList.add("Cadillac");
        assertTrue(integerList.contains("Cadillac"));
    }

    @Test
    void clear() {
        integerList.add("BMW");
        integerList.add("Mercedes");
        integerList.add("Cadillac");

        integerList.clear();
        int actualResult = integerList.size;

        assertEquals(0, actualResult);
    }

    @Test
    void size() {
        integerList.add("BMW");
        integerList.add("Mercedes");
        integerList.add("Cadillac");

        int actualResult = integerList.size();
        assertEquals(3, actualResult);
    }

    @Test
    void isEmpty() {
        assertTrue(integerList.isEmpty());
    }

    @Test
    void get() {
        integerList.add("BMW");
        integerList.add("Mercedes");
        integerList.add("Cadillac");

        String actualResult = integerList.get(1);

        assertEquals("Mercedes", actualResult);
    }

    @Test
    void testAdd() {
        integerList.add("BMW");
        integerList.add("Mercedes");

        integerList.add(1, "Cadillac");
        String actualResult = integerList.get(1);

        assertEquals("Cadillac", actualResult);
    }

    @Test
    void testRemove() {
        integerList.add("BMW");
        integerList.add("Mercedes");
        integerList.add("Cadillac");

        integerList.remove(2);

        int actualResult = integerList.size;
        assertEquals(2, actualResult);
    }

    @Test
    void indexOf() {
        integerList.add("BMW");
        integerList.add("Mercedes");
        integerList.add("Cadillac");

        int actualResult = integerList.indexOf("BMW");
        assertEquals(0, actualResult);
    }

    @Test
    void iterator() {
    }
}