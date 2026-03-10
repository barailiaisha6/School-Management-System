package com.example.school.controller;

import com.example.school.dao.ExamDAO;
import java.util.Scanner;

public class ExamController {

    ExamDAO ED = new ExamDAO();
    Scanner sc = new Scanner(System.in);

    public void addMarks() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        ED.addMarks(id, marks);
    }

    public void viewResults() {
        ED.showResults();
    }
}