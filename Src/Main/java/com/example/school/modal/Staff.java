package com.example.school.modal;

public class Staff {

    private int id;
    private String name;
    private String subject;

    public Staff(int id,String name,String subject){
        this.id=id;
        this.name=name;
        this.subject=subject;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }
}