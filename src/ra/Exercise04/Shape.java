package ra.Exercise04;

public abstract class Shape {
    protected  String color;
    public Shape() {

    }
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public void display(){
        System.out.println("Color: " + this.color);
    }
}
