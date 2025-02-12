package opgave03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Opgave03 {
    public static <r> void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);

        System.out.println("=================================");
        System.out.println("1.");
        runners.forEach(r -> System.out.println(String.format("%s %d",r.getName(), r.getLapTime())));

        System.out.println("=================================");
        System.out.println("2.");
        runners.forEach(r -> {
            if(r.getLapTime() < 30){
                System.out.println(String.format("%s %d",r.getName(), r.getLapTime()));
            }
        });

        System.out.println("=================================");
        System.out.println("3.");
        runners.sort((r1, r2) -> Integer.compare(r1.getLapTime(), r2.getLapTime()));
        // Returns a negative, positive, or 0 integer value - similar to a compareTo() from Compatible interface
        System.out.println(runners);

    }
}