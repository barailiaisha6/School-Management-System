package com.example.school.modal;

public class Fee {

    private int studentId;
    private double amount;

    public Fee(int studentId,double amount){
        this.studentId=studentId;
        this.amount=amount;
    }

    public int getStudentId(){
        return studentId;
    }

    public double getAmount(){
        return amount;
    }
}