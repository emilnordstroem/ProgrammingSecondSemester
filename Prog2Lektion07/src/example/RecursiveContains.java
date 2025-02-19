package example;

import java.util.ArrayList;

public class RecursiveContains {
    public static <E> boolean  contains(ArrayList<E> list, E element) {
        return contains(list, element, 0);
    }

    private static <E> boolean contains(ArrayList<E> list, E element, int index) {
        if (index >= list.size()) {
            return false;
        }
        if (list.get(index).equals(element)) {
            return true;
        }
        return contains(list, element, index + 1);
    }
}
