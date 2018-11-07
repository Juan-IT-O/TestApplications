import java.util.Scanner;

public class Absolute {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbe calkowita: ");
        int anyInt= in.nextInt();

        System.out.println("Wartosc bezwzgledna wynosi: " + Math.abs(anyInt));
    }
}
