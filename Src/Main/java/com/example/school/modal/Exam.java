package com.example.school.modal;

public class Exam {

    private int studentId;
    private int marks;

    public Exam(int studentId,int marks){
        this.studentId=studentId;
        this.marks=marks;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getMarks(){
        return marks;
    }
}