package dao;

import modal.Student;

public class StudentDAO {

    Student[] students = new Student[50];
    int count = 0;

    public void addStudent(int id, String name, String grade) {
        students[count] = new Student(id, name, grade);
        count++;
        System.out.println("Student added successfully.");
    }

    public void showAllStudents() {
        System.out.println("\n===== STUDENT LIST =====");

        for (int i = 0; i < count; i++) {
            System.out.println(
                students[i].getId() + " " +
                students[i].getName() + " " +
                students[i].getGrade()
            );
        }
    }
}