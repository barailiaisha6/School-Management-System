package dao;

import modal.Timetable;

public class TimetableDAO {

    Timetable[] schedule = new Timetable[30];
    int count = 0;

    public void addSchedule(String day, String subject) {

        schedule[count] = new Timetable(day, subject);
        count++;

        System.out.println("Schedule added.");
    }

    public void showSchedule() {

        System.out.println("\n===== TIMETABLE =====");

        for (int i = 0; i < count; i++) {
            System.out.println(
                schedule[i].getDay() + " : " +
                schedule[i].getSubject()
            );
        }
    }
}