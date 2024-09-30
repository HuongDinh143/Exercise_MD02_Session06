package ra.ra.Exercise05;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public int calculateSalary() {
        return super.getPaymentPerHour()*8;
    }
}
