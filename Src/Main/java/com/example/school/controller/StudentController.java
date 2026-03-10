package com.example.school.controller;

import com.example.school.dao.StudentDAO;
import java.util.Scanner;

public class StudentController {
      public static void main(String[] args) {
    StudentDAO SD = new StudentDAO();
    Scanner sc = new Scanner(System.in);
 }

    public void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        SD.addStudent(id, name, grade);
    }

    public void viewStudents() {
        SD.showAllStudents();
    }
}