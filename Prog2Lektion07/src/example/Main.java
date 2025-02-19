package example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(13, 67, -12, 121, 0, 2));
        System.out.println("sum(integers) = " + RecursiveSum.sum(integers));

        System.out.println("RecursiveContains.contains(integers, 121) = " + RecursiveContains.contains(integers, 121));
        System.out.println("RecursiveContains.contains(integers, 1001) = " + RecursiveContains.contains(integers, 1001));

        ArrayList<String> names = new ArrayList<>(List.of("Søren", "Torben", "Stinne", "Margrethe", "Hanne", "Benn", "Michael", "Esben"));
        System.out.println("RecursiveContains.contains(names, \"Benn\") = " + RecursiveContains.contains(names, "Benn"));
        System.out.println("RecursiveContains.contains(names, \"Henrik\") = " + RecursiveContains.contains(names, "Henrik"));
    }
}
