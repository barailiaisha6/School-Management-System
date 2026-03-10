package com.example.school.modal;

public class Timetable {

    private String day;
    private String subject;

    public Timetable(String day,String subject){
        this.day=day;
        this.subject=subject;
    }

    public String getDay(){
        return day;
    }

    public String getSubject(){
        return subject;
    }
}