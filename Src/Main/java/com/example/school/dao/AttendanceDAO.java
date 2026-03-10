package dao;

import modal.Attendance;

public class AttendanceDAO {

    Attendance[] attendance = new Attendance[50];
    int count = 0;

    public void markAttendance(int studentId, boolean present) {

        attendance[count] = new Attendance(studentId, present);
        count++;

        System.out.println("Attendance marked.");
    }

    public void showAttendance() {

        System.out.println("\n===== ATTENDANCE RECORD =====");

        for (int i = 0; i < count; i++) {
            System.out.println(
                "Student ID: " + attendance[i].getStudentId() +
                " Present: " + attendance[i].isPresent()
            );
        }
    }
}`