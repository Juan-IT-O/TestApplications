import java.util.Scanner;

public class RightTriangleValidator {
    public static void main(String[] args) {
        double[] trianglesides = readNumbersFromConsole(3);
        System.out.println(rightTriangleValidator(triangleSidesQuadrator(trianglesides)));

    }
    static double[] readNumbersFromConsole(int amountOfNumbers) {
        Scanner scanner = new Scanner(System.in);
        double[] tableOfNumbers = new double[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.print("Podaj liczbe nr "+ i+": ");
            System.out.println("");
            tableOfNumbers[i] = scanner.nextDouble();
        }
        return tableOfNumbers;
    }

    static double[] triangleSidesQuadrator(double[] trianglesides){
        double[] newSides = new double[trianglesides.length];

        for (int i = 0; i < newSides.length; i++) {
            newSides[i] = Math.pow(trianglesides[i],2);
        }
        return newSides;
    }

    static boolean rightTriangleValidator(double[] quadroSides){
        double[] quadroSums = new double[quadroSides.length];
        quadroSums[0] = quadroSides[0]+quadroSides[1];
        quadroSums[1] = quadroSides[0]+quadroSides[2];
        quadroSums[2] = quadroSides[1]+quadroSides[2];
        if(quadroSums[0]==quadroSides[2]||quadroSums[1]==quadroSides[1]||quadroSums[2]==quadroSides[0]){
            return true;
        }else{
            return false;
        }

    }
}
