import java.util.ArrayList;
import java.util.List;

public class Opgave01 {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println(numbersOfEvenNumbers(integers));
    }

    private static int numbersOfEvenNumbers(ArrayList<Integer> integers){
        return isNumberEven(integers, 0,integers.size() - 1);
    }

    private static int isNumberEven (ArrayList<Integer> integers, int counter, int n) {
        if(n <= 1){
            return counter + 1;
        }
        if(integers.get(n) % 2 == 0){
            counter++;
        }
        return isNumberEven(integers, counter, n - 1);
    }

}
