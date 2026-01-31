import java.util.Scanner;

public class StudentService {

    private StudentDAO dao = new StudentDAO();

    public void addStudent(int id, String name, String grade) {
        dao.addStudent(new Student(id, name, grade));
    }

    public void showStudents() {
        System.out.println("Students:");
        for (Student s : dao.getAllStudents()) {
            if (s != null) {
                System.out.println(s.getId() + " " + s.getName() + " " + s.getGrade());
            }
        }
    }
}
