package opgave03.list;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentNo;
    private String name;
    private List<Integer> grades;

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public void addGrades(List<Integer> grades){
        this.grades.addAll(grades);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString(){
        return "";
    }

}
