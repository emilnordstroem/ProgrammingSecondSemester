package opgave02;

import opgave02.models.ArrayBag;

import java.util.ArrayList;
import java.util.List;

public class Opgave02 {
    public static void main(String[] args) {
        ArrayBag<Integer> integerArrayBag = new ArrayBag<>(); // capacity of 10
        // add -> passed
        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(10, 20, 30, 40, 50, 50, 60, 70, 80, 90));
        for(Integer integer : integerArrayList){
            integerArrayBag.add(integer);
        }
        System.out.println("Current size (add()): " + integerArrayBag.getCurrentSize());
        System.out.println();

        // frequency/contains -> passed
        System.out.println("getFrequency(E anEntry): " + integerArrayBag.getFrequencyOf(40));
        System.out.println("contains(E anEntry): " + integerArrayBag.contains(90));
        System.out.println();

        // remove -> passed
        System.out.println("remove(): " + integerArrayBag.remove());
        System.out.println("Current size: " + integerArrayBag.getCurrentSize());
        System.out.println();
        System.out.println("remove(E anEntry): " + integerArrayBag.remove(50));
        System.out.println("Current size: " + integerArrayBag.getCurrentSize());
        System.out.println();

        // toArray[] -> not passed
        for (Integer item : integerArrayBag.toArray()) {
            System.out.println(item);
        }
        System.out.println();

        // Clear -> passed
        integerArrayBag.clear();
        System.out.println("Current size (clear()): " + integerArrayBag.getCurrentSize());
    }
}
