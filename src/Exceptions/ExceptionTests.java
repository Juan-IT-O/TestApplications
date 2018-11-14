package Exceptions;

import Inheritance.Circle;

public class ExceptionTests {

    public static void main(String[] args) {
        try {
            Circle circle = new Circle(15.2);
            System.out.println(circle.calculateArea());
        } catch (InvalidSideException e) {
            System.out.println(e.getMessage());
        }

    }
}
