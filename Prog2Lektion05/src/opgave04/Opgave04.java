package opgave04;

import opgave03.Runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Opgave04 {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();

        /* Task 1 & 2
        OBS: Throws exception. Cause: Collection is being modified by multiple threads
        (trying to remove while iterating through the array)
         */
        // Iterator interface with an list method - iterator() allows to iterate through the elements
        Iterator<Runner> runnerIterator = runners.iterator();
        while(runnerIterator.hasNext()){ // returns the next element (if null, the loop breaks)
            if(runnerIterator.next().getLapTime() >= 40){ // .next() accesses the next element
                runnerIterator.remove(); // removing the current element
            }
        }
        // Removing elements of the list as it is being iterated
        System.out.println(runners);
        System.out.println();

        // Task 3 & 4 execution
        runners.removeIf(r -> r.getLapTime() >= 40);
        System.out.println(runners);
        System.out.println();
    }

    // Task 3 (similar to task 2 - with the use of the Predicate interface
    public static boolean removeif(List<Runner> runners, Predicate filter){
        Iterator<Runner> runnerIterator = runners.iterator();
        while(runnerIterator.hasNext()){
            if(filter.test(runnerIterator.next())){ // Runs text on the runner element
                runnerIterator.remove();
                return true;
            }
        }
        return false;
    }
}
