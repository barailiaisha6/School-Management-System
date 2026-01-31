import java.util.Scanner;

public class StaffService {

    private StaffDAO dao = new StaffDAO();

    public void addStaff(int id, String name, String subject) {
        dao.addStaff(new Staff(id, name, subject));
    }

    public void showStaff() {
        System.out.println("Staff:");
        for (Staff s : dao.getAllStaff()) {
            if (s != null) {
                System.out.println(s.getName() + " - " + s.getSubject());
            }
        }
    }
}
