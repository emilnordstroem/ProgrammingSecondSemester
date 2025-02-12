package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray();
        addPeople(peopleArray);
        System.out.println();

        //Den første person der hedder Klaus
        System.out.println("Den første person der hedder Klaus: " + peopleArray.findFirst(p -> p.getName().equals("Klaus")));
        //Den første person der har et navn med længden 4
        System.out.println("Den første person der har et navn med længden 4: " + peopleArray.findFirst(p -> p.getName().length() == 4));
        //Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1
        System.out.println(peopleArray.findFirst(p -> p.getAge() == 44));
        System.out.println(peopleArray.findFirst(p -> p.getName().charAt(0) == 'S'));
        System.out.println(peopleArray.findFirst(p -> {
            int counter = 0;
            for (char c : p.getName().toLowerCase().toCharArray()) {
                if(c == 'i'){
                    counter++;
                }
            }
            if(counter == 2){
                return true;
            }
            return false;
        }));
        System.out.println(peopleArray.findFirst(p -> p.getName().length() == p.getAge()));

        System.out.println(peopleArray.findAll(p -> p.getAge() > 30));
        System.out.println(peopleArray.findAll(p -> {
            if(p.getName().toLowerCase().toCharArray()[0] == 's'){
                return true;
            }
            return false;
        }));
        System.out.println(peopleArray.findAll(p -> p.getName().length() == 5));
        System.out.println(peopleArray.findAll(p -> p.getAge() >= 6 && p.getAge() < 40));
    }

    private static void addPeople(PeopleArray peopleArray) {
        peopleArray.addPerson(new Person("Bent", 25));
        peopleArray.addPerson(new Person("Susan", 34));
        peopleArray.addPerson(new Person("Mikael", 60));
        peopleArray.addPerson(new Person("Klaus", 44));
        peopleArray.addPerson(new Person("Birgitte", 17));
        peopleArray.addPerson(new Person("Liselotte", 9));
    }
}
