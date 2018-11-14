package Inheritance;

import Exceptions.InvalidSideException;

public class Inheritance {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("red", 10.5, 12.5);
        Square sqr = new Square("blue", 15.7);

        System.out.println("Pole prostokata wynosi: "+ rect.calculateArea());
        System.out.println("obwod kwadratu wynosi: "+ sqr.calculatePerimeter());

        AreaCountable[] figures = new Figure[4];
        figures[0]=rect;
        figures[1]=sqr;
        figures[2]= new Triangle("red",3,4, 5);
        try {
            figures[3] = new Circle(11.4);
        } catch (InvalidSideException e) {
            e.printStackTrace();
        }
        double sumOfAreas=0d;
        for (AreaCountable fig:figures) {
            sumOfAreas+=fig.calculateArea();
        }
        System.out.println("suma pol dzialek wynosi: "+ sumOfAreas);
    }
}
