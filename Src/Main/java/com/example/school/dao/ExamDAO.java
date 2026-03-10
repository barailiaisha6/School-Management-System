package dao;

import modal.Exam;

public class ExamDAO {

    Exam[] exams = new Exam[50];
    int count = 0;

    public void addMarks(int studentId, int marks) {

        exams[count] = new Exam(studentId, marks);
        count++;

        System.out.println("Marks added.");
    }

    public void showResults() {

        System.out.println("\n===== EXAM RESULTS =====");

        for (int i = 0; i < count; i++) {
            System.out.println(
                "Student ID: " + exams[i].getStudentId() +
                " Marks: " + exams[i].getMarks()
            );
        }
    }
}