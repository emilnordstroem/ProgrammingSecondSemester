package opgave03;

import opgave03.models.ArrayListRing;

public class Opgave03 {
    public static void main(String[] args) {
        ArrayListRing<String> ring = new ArrayListRing<>();

        System.out.println("Testing ArrayListRing...");

        System.out.println("Is the ring empty? " + ring.isEmpty()); // Expected: true

        ring.add("A");
        ring.add("B");
        ring.add("C");
        System.out.println("Added items: A, B, C");

        System.out.println("Size of the ring: " + ring.size());

        System.out.println("Current item: " + ring.getCurrentItem());

        ring.advance();
        System.out.println("After advancing, current item: " + ring.getCurrentItem());

        boolean removed = ring.removeItem("B");
        System.out.println("Removed item 'B': " + removed);
        System.out.println("Size after removing 'B': " + ring.size());

        String removedCurrent = ring.removeCurrentItem();
        System.out.println("Removed current item: " + removedCurrent);
        System.out.println("Size after removing current item: " + ring.size());

        System.out.println("Is the ring empty now? " + ring.isEmpty());

        ring.add("D");
        System.out.println("Added item: D");
        System.out.println("Current item: " + ring.getCurrentItem());

        ring.removeCurrentItem();
        ring.removeCurrentItem();
        ring.removeCurrentItem();

        System.out.println("Is the ring empty after removing all items? " + ring.isEmpty());
    }
}
