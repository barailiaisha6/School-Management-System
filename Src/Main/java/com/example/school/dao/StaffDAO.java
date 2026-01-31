
public class StaffDAO {

    private Staff[] staff = new Staff[20];
    private int count = 0;

    public void addStaff(Staff s) {
        staff[count++] = s;
    }

    public Staff[] getAllStaff() {
        return staff;
    }
}
