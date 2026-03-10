package com.example.school.modal;

public class Attendance {

    private int studentId;
    private boolean present;

    public Attendance(int studentId, boolean present){
        this.studentId = studentId;
        this.present = present;
    }

    public int getStudentId(){
        return studentId;
    }

    public boolean isPresent(){
        return present;
    }
}