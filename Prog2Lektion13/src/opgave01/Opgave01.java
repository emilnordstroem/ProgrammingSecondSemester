package opgave01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave01 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98 ));

        // sets: unordered sequence
        System.out.println("A");
        print(mySet);
        System.out.println("=================");

        System.out.println("B + C");
        // creating a duplication issue
        mySet.add(23);
        print(mySet);
        System.out.println("=================");

        System.out.println("D");
        mySet.remove(67);
        print(mySet);
        System.out.println("=================");

        System.out.println("E");
        boolean exists = mySet.contains(23);
        System.out.println(exists);
        System.out.println("=================");

        System.out.println("F");
        System.out.println(mySet.size());
        System.out.println("=================");
    }

    private static void print(Set<Integer> set){
        set.forEach(integer -> {
            System.out.println(integer);
        });
    }

}
