package examples;

import examples.maximum.Maximum;
import examples.sorting.QuickSort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static ArrayList<Integer> integers = new ArrayList<>(List.of(
            18, 505, -3000, 42, 0 , 350, 202, 53, 14, 975
    ));

    public static void main(String[] args) {
        System.out.println("Højeste tal er: " + Maximum.maximum(integers));
        QuickSort.sort(integers);
        System.out.println(integers);
//        ArrayList<Integer> generatedList = generateListWithRandomNumber(1_000_000);
//        Instant start = Instant.now();
//        QuickSort.sort(generatedList);
//        Instant finish = Instant.now();
//        System.out.println("Sorteringen tog " + Duration.between(start, finish).toMillis() + " ms.");
    }

    public static ArrayList<Integer> generateListWithRandomNumber(int size) {
        ArrayList<Integer> generatedList = new ArrayList<>(size);
        Random random = new Random();
        for (int count = 0; count < size; count++) {
            generatedList.add(random.nextInt());
        }
        return generatedList;
    }
}