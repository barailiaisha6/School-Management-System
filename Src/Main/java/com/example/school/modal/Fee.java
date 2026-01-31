

public class Fee {
    private int studentId;
    private double amount;

    public Fee(int studentId, double amount) {
        this.studentId = studentId;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
