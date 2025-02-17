package Opgave02;

import java.util.HashMap;

public class Opgave02Main {
    private final static HashMap<Integer, Integer> memorization = new HashMap<>();

    public static int fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Tree structure
    }

    // Extra
    public static int fibonacciWithMemorization(int n){
        if(n <= 1){
            return n;
        }
        if(memorization.containsKey(n)){
            return memorization.get(n);
        }
        int result = fibonacciWithMemorization(n - 1) + fibonacciWithMemorization(n - 2); // Tree structure
        memorization.put(n, result);
        return result;
    }
}
