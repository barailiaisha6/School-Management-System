import java.util.scanner;

public class StudentDAO {

    private Student[] students = new Student[50];
    private int count = 0;

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Student list is full!");
        }
    }

    public Student[] getAllStudents() {
        return students;
    }

    public int getCount() {
        return count;
    }
}


