package Opgave01;

public class Opgave01Main {
    public static int factorial(int n) {
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
