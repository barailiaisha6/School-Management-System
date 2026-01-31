import java.util.Scanner;

public class ExamService {

    private Exam[] exams = new Exam[20];
    private int count = 0;

    public void addMarks(int studentId, int marks) {
        exams[count++] = new Exam(studentId, marks);
    }

    public void showResults() {
        System.out.println("Exam Results:");
        for (Exam e : exams) {
            if (e != null) {
                System.out.println("Student ID: " + e.getStudentId()
                        + " Marks: " + e.getMarks());
            }
        }
    }
}
