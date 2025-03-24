package opgave03.map;

import java.util.*;

public class Collage {
    private String name;
    private Map<Integer, Student> attendingStudents;

    public Collage(String name) {
        this.name = name;
        this.attendingStudents = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        attendingStudents.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student){
        attendingStudents.remove(student.getStudentNo());
    }

    public double calcAverage(){
        int sumOfAllStudentAverage = 0;

        for(Map.Entry<Integer, Student> student : attendingStudents.entrySet() ){
            int sumOfStudentGrades = 0;
            for(Integer grade : student.getValue().getGrades()){
                sumOfStudentGrades += grade;
            }
            sumOfAllStudentAverage += sumOfStudentGrades / student.getValue().getGrades().size();
        }

        return sumOfAllStudentAverage / attendingStudents.size();
    }

    public Student findStudent(Student seekedStudent){
        return attendingStudents.get(seekedStudent.getStudentNo());
    }

    @Override
    public String toString(){
        return "";
    }

}
