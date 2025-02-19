package opgave03;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            System.out.println(i + " : " + threeXPlusOne(i));
        }
    }

    private static int threeXPlusOne(int x) {
        return collatzRule(0, x);
    }

    private static int collatzRule(int counter, int number){
        if(number <= 1){
            return counter + 1;
        }
        if(number % 2 == 0){
            return collatzRule(counter + 1, number / 2);
        } else {
            return collatzRule(counter + 1, number * 3 + 1);
        }
    }
}
