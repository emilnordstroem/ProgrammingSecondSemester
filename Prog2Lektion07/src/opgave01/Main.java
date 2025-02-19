package opgave01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(32, 23, 13, -22, 202, 42, 53, 0));
        System.out.println("Antal lige tal = " + numberOfEvenNumbers(integers));
    }

    private static int numberOfEvenNumbers(ArrayList<Integer> integers) {
        return evenNumberCounter(integers, 0, 0);
    }

    private static int evenNumberCounter(ArrayList<Integer> integers, int counter, int index){
        if(index >= integers.size()){
            return counter;
        }
        if(integers.get(index) % 2 == 0){
            return evenNumberCounter(integers, counter + 1, index + 1);
        }
        return evenNumberCounter(integers, counter, index + 1);
    }
}
