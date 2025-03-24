package opgave03.comparableAndComparator;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Collage implements Comparator<Student> {
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

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getName().compareTo(secondStudent.getName());
    }
}
