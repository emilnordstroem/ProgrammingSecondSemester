package examples.maximum;

import java.util.ArrayList;

public class Maximum {
    //The content of the ArrayList should implement the Camparable interface such that we can compare them
    public static <T extends Comparable<T>> T  maximum(ArrayList<T> candidates) {
        return maximum(candidates, 0, candidates.size() -1);
    }

    public static <T extends Comparable<T>> T maximum(ArrayList<T> candidates, int low, int high) {
        if (low >= high) {
            // The maximum value in a list with one element is trivial to find.
            return candidates.get(low);
        }
        int mid = (low + high) / 2;
        //Find the maximum member of left side of the list
        T maxLeft = maximum(candidates, low, mid);
        //Find the maximum member of the right side of the list
        T maxRight = maximum(candidates, mid + 1, high);
        //Combine the result of the two sides
        if (maxLeft.compareTo(maxRight) > 0) {
            return maxLeft;
        } else {
            return maxRight;
        }
    }
}
