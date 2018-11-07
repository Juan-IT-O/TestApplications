import static java.lang.Math.*;

public class Odcinek {
    public static void main(String[] args) {
        double coordinateX1 = 2.14;
        double coordinateY1 = 45.78;

        double coordinateX2 = 14.48;
        double coordinateY2 = 478.12;

        double length = sqrt(pow(coordinateX2-coordinateX1,2)+pow(coordinateY2-coordinateY1,2));
        int lengthInSteps = (int)(length/0.8);

        System.out.println("Dlugosc odcinka to: "+ length);
        System.out.println("Dlugosc trasy w krokach to: " + lengthInSteps);
    }
}
