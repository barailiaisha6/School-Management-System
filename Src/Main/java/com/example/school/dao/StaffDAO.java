package dao;

import modal.Staff;

public class StaffDAO {

    Staff[] staff = new Staff[30];
    int count = 0;

    public void addStaff(int id, String name, String subject) {
        staff[count] = new Staff(id, name, subject);
        count++;
        System.out.println("Staff added successfully.");
    }

    public void showAllStaff() {

        System.out.println("\n===== STAFF LIST =====");

        for (int i = 0; i < count; i++) {
            System.out.println(
                staff[i].getId() + " " +
                staff[i].getName() + " " +
                staff[i].getSubject()
            );
        }
    }
}