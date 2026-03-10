package dao;

import modal.Fee;

public class FeeDAO {

    Fee[] fees = new Fee[50];
    int count = 0;

    public void addFee(int studentId, double amount) {

        fees[count] = new Fee(studentId, amount);
        count++;

        System.out.println("Fee recorded.");
    }

    public void showFees() {

        System.out.println("\n===== FEE RECORD =====");

        for (int i = 0; i < count; i++) {
            System.out.println(
                "Student ID: " + fees[i].getStudentId() +
                " Amount: " + fees[i].getAmount()
            );
        }
    }
}