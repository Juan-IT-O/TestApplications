import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double[] initialParameters = readNumbersFromConsole(3);
        double[] resultTable = equationResults(initialParameters[0], initialParameters[1],initialParameters[2]);
        printResults(resultTable);

    }

    private static double calculateDelta(double a, double b, double c) {
        return ((Math.pow(b, 2)) - (4 * (a * c)));
    }

    private static int checkNumberOfResults(double delta) {
        if (delta > 0) {
            return 1;
        } else if (delta == 0) {
            return 0;
        } else {
            return -1;
        }

    }

    private static double[] equationResults(double a, double b, double c) {
        double delta = calculateDelta(a, b, c);
        int numOfResults = checkNumberOfResults(delta);

        switch (numOfResults) {
            case -1:
                return new double[0];
            case 0:
                double x0 = -b / (2 * a);
                return new double[]{x0};
            case 1:
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b - sqrtDelta) / (2 * a);
                double x2 = (-b + sqrtDelta) / (2 * a);
                return new double[]{x1, x2};
            default: return new double[0];
        }

    }

    private static void printResults(double[] resultTable){
        System.out.println("Rownanie posiada "+ resultTable.length + " rozw:\n");
        for (int i = 0; i < resultTable.length; i++) {
            System.out.println("Wynik "+ (i+1) + " wynosi: " + resultTable[i]);
        }
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




}
