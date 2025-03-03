package opgave02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(0, 14, 0, 42, 0, -1, 0 , 101));
        int numberOfZeros = countZeros(integers);
        System.out.println(numberOfZeros);
    }

    private static int countZeros(ArrayList<Integer> integers) {
        if(integers.size() <= 1){
            if(integers.getFirst() == 0){
                return 1;
            } else {
                return 0;
            }
        }

        int middle = integers.size() / 2;
        ArrayList<Integer> leftSide = new ArrayList<>(integers.subList(0, middle));
        ArrayList<Integer> rightSide = new ArrayList<>(integers.subList(middle, integers.size()));

        int leftCountZero = countZeros(leftSide);
        int rightCountZero = countZeros(rightSide);

        return leftCountZero + rightCountZero;
    }
}
