package com.example.example.controller;

import com.example.school.dao.TimetableDAO;
import java.util.Scanner;

public class TimetableController {

    TimetableDAO TD = new TimetableDAO();
    Scanner sc = new Scanner(System.in);

    public void addSchedule() {

        System.out.print("Enter Day: ");
        String day = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        TD.addSchedule(day, subject);
    }

    public void viewSchedule() {
        TD.showSchedule();
    }
}