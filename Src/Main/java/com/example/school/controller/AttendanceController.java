package com.example.school.controller;

import com.example.school.dao.AttendanceDAO;
import java.util.Scanner;

public class AttendanceController {
    public static void main(String[] args) {
   
    AttendanceDAO AD = new AttendanceDAO();
    Scanner sc = new Scanner(System.in);
     }


    public void markAttendance() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Present (true/false): ");
        boolean present = sc.nextBoolean();

        AD.markAttendance(id, present);
    }

    public void viewAttendance() {
        AD.showAttendance();
    }
}