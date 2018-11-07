import java.sql.SQLOutput;
import java.util.Scanner;

public class ArithmeticAverage {

    public static void main(String[] args) {
        double sum = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Podaj " + i + " liczbe:");
            sum += in.nextInt();
        }
        double aritmeticAverage = sum / 3d;
        System.out.println("Srednia arytmetyczna wynosi " + aritmeticAverage);

    }
}
