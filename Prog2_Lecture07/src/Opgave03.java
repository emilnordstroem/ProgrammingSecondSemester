public class Opgave03 {

    public static void main(String[] args) {
        int number = 10;
        System.out.printf("Result: %d loops before 1",
                collatzCounter(number));
    }

    private static int collatzCounter(int number){
        return collatzRule(number, 0);
    }

    private static int collatzRule(int number, int counter){
        System.out.println(number);
        if(number <= 1){
            return counter + 1;
        }
        if(number % 2 == 0){
            return collatzRule(number / 2, counter + 1);
        } else {
            return collatzRule(number * 3 + 1, counter + 1);
        }
    }


}