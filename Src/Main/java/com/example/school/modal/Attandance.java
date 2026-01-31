

public class Attendance {
    private int studentId;
    private boolean present;

    public Attendance(int studentId, boolean present) {
        this.studentId = studentId;
        this.present = present;
    }

    public boolean isPresent() {
        return present;
    }
}
