package ra.Exercise04;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("blue",10);
        System.out.println("Dien tich hinh tron la: "+c.getArea());
        Rectangle r = new Rectangle("red",5,10);
        System.out.println("Dien tich hinh chu nhat la: "+r.getArea());
        r.display();
    }
}
