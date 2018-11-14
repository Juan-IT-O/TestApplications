package Inheritance;

public class Rectangle extends Figure {

    protected double sideA, sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double calculateArea() {
        return sideA * sideB;
    }

    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }
    public Rectangle copyRect(){
        return new Rectangle(this.color, this.sideA, this.sideB);
    }
}
