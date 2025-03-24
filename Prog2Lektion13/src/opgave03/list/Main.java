package opgave03.list;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Collage erhvervsakadamiet = new Collage("Erhvervsakadamiet");

        // Create students
        Student alice = new Student(1, "Alice");
        alice.addGrades(List.of(2, 10, 7));

        Student bob = new Student(2, "Bob");
        bob.addGrades(List.of(12, 10, 10));

        Student charlie = new Student(3, "Charlie");
        charlie.addGrades(List.of(4, 7, 7));

        Student david = new Student(4, "David");
        david.addGrades(List.of(0, 2, 2));

        Student eve = new Student(5, "Eve");
        eve.addGrades(List.of(2, -3, 7));

        erhvervsakadamiet.addStudent(alice);
        erhvervsakadamiet.addStudent(bob);
        erhvervsakadamiet.addStudent(charlie);
        erhvervsakadamiet.addStudent(david);
        erhvervsakadamiet.addStudent(eve);

        System.out.println("Average grade: " + erhvervsakadamiet.calcAverage());

        Student searchStudent = erhvervsakadamiet.findStudent(new Student(3, "Charlie"));
        if (searchStudent != null) {
            System.out.println("Student found: " + searchStudent.getName());
        } else {
            System.out.println("Student not found.");
        }
    }

}
