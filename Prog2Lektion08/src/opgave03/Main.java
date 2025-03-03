package opgave03;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Janus", "Markus", "Peter", "Line", "Mads", "Søren", "Mathias", "Trine", "Anders"));
        int number = countStringsOfLength(names, 5);
        System.out.println("number = " + number);
        System.out.println();
        printElementsOfLength(names, 5);
        System.out.println();
        System.out.println("Navne med længde = 5 : " + elementsOfLength(names, 5));
    }


    /**
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return the number of elements in strings with the specified length
     */
    public static int countStringsOfLength(ArrayList<String> strings, int length) {
        if(strings.size() <= 1){
            if(strings.getFirst().length() == length){
                return 1;
            } else {
                return 0;
            }
        }

        int middle = strings.size() / 2;
        ArrayList<String> subListLeft = new ArrayList<>(strings.subList(0, middle));
        ArrayList<String> subListRight = new ArrayList<>(strings.subList(middle, strings.size()));

        int countLeft = countStringsOfLength(subListLeft, length);
        int countRight = countStringsOfLength(subListRight, length);

        return countLeft + countRight;
    }


    /**
     * Writes the elements of strings to the console with the specified lenght
     * @param strings ArrayList of elements
     * @param length the length to test for
     */
    public static void printElementsOfLength(ArrayList<String> strings, int length) {
        if(strings.size() <= 1){
            if(strings.getFirst().length() == length){
                System.out.println(strings.getFirst());
            }
        } else {
            int middle = strings.size() / 2;
            printElementsOfLength(new ArrayList<>(strings.subList(0, middle)), length);
            printElementsOfLength(new ArrayList<>(strings.subList(middle, strings.size())), length);
        }
    }

    /**
     *
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return a new ArrayList with all elements from strings with the specified lenght
     */
    public static ArrayList<String> elementsOfLength(ArrayList<String> strings, int length) {
        if(strings.size() <= 1){
            if(strings.getFirst().length() == length){
                ArrayList<String> resultList = new ArrayList<>();
                resultList.add(strings.getFirst());
                return resultList;
            } else {
                return new ArrayList<>();
            }
        }
        int middle = strings.size() / 2;
        ArrayList<String> subListLeft = elementsOfLength(new ArrayList<>(strings.subList(0, middle)), length);
        ArrayList<String> subListRight = elementsOfLength(new ArrayList<>(strings.subList(middle, strings.size())), length);

        ArrayList<String> combineList = new ArrayList<>(subListLeft);
        combineList.addAll(subListRight);
        return combineList;
    }
}
