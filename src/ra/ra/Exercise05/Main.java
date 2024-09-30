package ra.ra.Exercise05;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee1 = new FullTimeEmployee("Anh",50);
        Employee fullTimeEmployee2 = new FullTimeEmployee("Mai",60);
        Employee partTimeEmployee1 = new PartTimeEmployee("B",30,5);
        System.out.println("Luong cua Anh: "+fullTimeEmployee1.calculateSalary());
        System.out.println("Luong cua Mai: "+fullTimeEmployee2.calculateSalary());
        System.out.println("Luong cua B: "+partTimeEmployee1.calculateSalary());

    }
}
