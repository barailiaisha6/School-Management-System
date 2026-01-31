

public class Timetable {
    private String day;
    private String subject;

    public Timetable(String day, String subject) {
        this.day = day;
        this.subject = subject;
    }

    public String getDetails() {
        return day + " - " + subject;
    }
}
