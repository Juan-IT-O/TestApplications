package Inheritance;

import Exceptions.InvalidSideException;

public class Circle implements AreaCountable {
    protected static final double PI = 3.1415;

    protected double radius;

    public Circle(double radius) throws InvalidSideException {
        if(radius<0){
            throw new InvalidSideException();
        }
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return PI* Math.pow(radius,2);
    }
}
