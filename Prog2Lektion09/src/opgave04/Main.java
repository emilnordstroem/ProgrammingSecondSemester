package opgave04;

import opgave04.model.Absence;

public class Main {

    public static void main(String[] args) {
        Absence absence = new Absence();

        absence.print();
        System.out.println("=========================================");
        System.out.printf("Total absence of student 1: %d%n",
                absence.totalAbsence(1)
        );
        System.out.println("=========================================");
        System.out.printf("Students without Absence: %d%n",
                absence.studentsWithoutAbsence()
        );
        System.out.println("=========================================");
        System.out.printf("Student with most absence: %d%n",
                absence.mostAbsence()
        );
        System.out.println("=========================================");
        absence.reset(1);
        System.out.printf("Reset student 1:%nCurrent absence: %d%n",
                absence.totalAbsence(1)
        );
    }
}