package com.example.school.controller;

import com.example.school.dao.StaffDAO;
import java.util.Scanner;

public class StaffController {
      public static void main(String[] args) {
    StaffDAO SD = new StaffDAO();
    Scanner sc = new Scanner(System.in);
 }

    public void addStaff() {

        System.out.print("Enter Staff ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Staff Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        SD.addStaff(id, name, subject);
    }

    public void viewStaff() {
        SD.showAllStaff();
    }
}