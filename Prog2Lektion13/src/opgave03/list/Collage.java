package opgave03.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collage {
    private String name;
    private List<Student> attendingStudents;

    public Collage(String name) {
        this.name = name;
        this.attendingStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        attendingStudents.add(student);
    }

    public void removeStudent(Student student){
        attendingStudents.remove(student);
    }

    public double calcAverage(){
        int sumOfAllGrades = 0;
        Iterator<Student> studentIterator = attendingStudents.iterator();
        while(studentIterator.hasNext()){
            int counter = 0;
            int sumOfAllStudentGrades = 0;
            for(int grade : studentIterator.next().getGrades()){
                sumOfAllStudentGrades += grade;
                counter++;
            }
            sumOfAllGrades += (sumOfAllStudentGrades / counter);
        }
        return sumOfAllGrades / attendingStudents.size();
    }

    public Student findStudent(Student seekedStudent){
        Iterator<Student> studentIterator = attendingStudents.iterator();
        while(studentIterator.hasNext()){
            Student student = studentIterator.next();
            if(student.getStudentNo() == seekedStudent.getStudentNo()){
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return "";
    }

}
