package examples.sorting;

import java.util.ArrayList;

public class QuickSort {
    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
        sort(list, 0, list.size() - 1);
    }

    private static <T extends Comparable<T>> void sort(ArrayList<T> list, int low, int high) {
        if (low < high) {
            int indexOfPivotElement = partition(list, low, high);
            sort(list, low, indexOfPivotElement - 1);
            sort(list, indexOfPivotElement + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(ArrayList<T> list, int low, int high) {
        T pivotElement = list.get(low);
        int indexLow = low + 1;
        int indexHigh = high;
        while (indexLow <= indexHigh) {
            if (list.get(indexLow).compareTo(pivotElement) <= 0) {
                indexLow++;
            } else if (list.get(indexHigh).compareTo(pivotElement) > 0) {
                indexHigh--;
            } else {
                swap(list, indexLow, indexHigh);
                indexLow++;
                indexHigh--;
            }
        }
        swap(list, low, indexHigh);
        return indexHigh;
    }

    private static <T> void swap(ArrayList<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
