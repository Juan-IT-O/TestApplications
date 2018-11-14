package OOP;

public class Rectangle {
    private double shorterSide, longerSide;

    public Rectangle(double shorterSide, double longerSide) {

        this.shorterSide = shorterSide;
        this.longerSide = longerSide;

    }

    public Rectangle(double squareSide) {
        new Rectangle(squareSide, squareSide);
    }

    public double getLongerSide() {
        return longerSide;
    }

    public double getShorterSide() {
        return shorterSide;
    }

    public void setLongerSide(double longerSide) {
        this.longerSide = longerSide;
    }

    public void setShorterSide(double shorterSide) {
        this.shorterSide = shorterSide;
    }

    private double calculatePerimeter() {
        return 2 * (shorterSide + longerSide);
    }

    private double calculateArea() {
        return shorterSide * longerSide;
    }
}
