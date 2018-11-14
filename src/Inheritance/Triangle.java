package Inheritance;

public class Triangle extends Figure {
    double sideA,sideB,sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(String color, double sideA, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideC;
    }


    public double calculateArea() {
        double p = (sideA+sideB+sideC)/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
}