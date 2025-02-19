package example;

import java.util.ArrayList;

public class RecursiveSum {
    public static int sum(ArrayList<Integer> integers) {
        return sum(integers, 0);
    }

    private static int sum(ArrayList<Integer> integers, int index) {
        if (index >= integers.size()) {
            return 0;
        }
        return integers.get(index) + sum(integers, index + 1);
    }
}
