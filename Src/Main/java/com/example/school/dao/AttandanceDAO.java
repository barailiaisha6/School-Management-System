

public class AttendanceDAO {

    private Attendance[] records = new Attendance[50];
    private int count = 0;

    public void markAttendance(Attendance a) {
        records[count++] = a;
    }
}
