import java.util.Scanner;

public class SimpleMultiplication {

    public static void main(String[] args) {
        double[] numbersArr = readNumbersFromConsole();
        System.out.println("suma wyniesie: "+simpleMulti(numbersArr[0],numbersArr[1]));

        }


    static double simpleMulti(double firstNumber, double secondNumber){
        double result = 0.0;
        for (int i = 0; i < (int)secondNumber; i++) {
            result+=firstNumber;
        }
        result+=firstNumber*(secondNumber-(int)secondNumber);
        if(negativeValueChecker(firstNumber,secondNumber)){
            result=(-1.0*result);
        }
        return result;
    }

    static double[] readNumbersFromConsole() {
        Scanner scanner = new Scanner(System.in);
        double[] tableOfNumbers = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Podaj liczbe nr "+ (i+1)+": ");
            System.out.println("");
            tableOfNumbers[i] = scanner.nextDouble();
        }
        return tableOfNumbers;
    }
    static boolean negativeValueChecker(double firstNumber, double secondNumber){
    //todo dokonczyc warunki dla liczb ujemnych
        if(firstNumber<0 && secondNumber<0){
            return false;
        }else{
           return true;
        }
    }
}
