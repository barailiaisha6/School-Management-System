package com.example.school.controller;

import com.example.school.dao.FeeDAO;
import java.util.Scanner;

public class FeeController {

    FeeDAO FD = new FeeDAO();
    Scanner sc = new Scanner(System.in);

    public void addFee() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Fee Amount: ");
        double amount = sc.nextDouble();

        FD.addFee(id, amount);
    }

    public void viewFees() {
        FD.showFees();
    }
}