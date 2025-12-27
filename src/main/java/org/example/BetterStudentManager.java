package org.example;

// In a separate (adjacent) file, create a Student class with two public members:
// - A String member called name
// - A double member called grade

import java.util.ArrayList;
import java.util.List;

public class BetterStudentManager {
    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        // This method should add a new student to the list of students
        Student student = new Student();
        student.name = name;
        student.grade = grade;
        students.add(student);
    }

    public void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.name.equals(name)) {
                students.remove(i);
                break;
            }
        }
    }

    public String getStudentList() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.name);
            sb.append(" ");
            sb.append(student.grade);
            sb.append("\n");
        }
        return sb.toString();
    }
}
