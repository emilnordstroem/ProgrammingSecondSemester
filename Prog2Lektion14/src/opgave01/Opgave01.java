package opgave01;

import opgave01.models.LinkedList;

public class Opgave01 {
    public static void main(String[] args) {
        LinkedList<String> carNames = new LinkedList<>();
        carNames.add("BMW");
        System.out.println(carNames.isEmpty());
    }
}
