import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        StaffService staffService = new StaffService();
        ExamService examService = new ExamService();

        System.out.println("=== School Management System ===");

        
        studentService.addStudent(1, "Aisha", "11");
        studentService.addStudent(2, "Sangrila", "10");
        studentService.showStudents();

        staffService.addStaff(1, "Mr. Sharma", "Math");
        staffService.showStaff();

        examService.addMarks(1, 85);
        examService.showResults();
    }
}
