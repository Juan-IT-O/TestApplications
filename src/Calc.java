import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String chosenOption;
        double firstNumber, secondNumber, resoult = 0;
        boolean turnOff = false, calculateSucces = true;


        while (!turnOff) {
            calculateSucces = true;
            System.out.println("podaj numer odpowiadajacy operacji do wykonania:\n" +
                    "+ Dodawanie\n" +
                    "- Odejmowanie\n" +
                    "/ Dzielenie\n" +
                    "* Mnozenie\n" +
                    "% Reszta z dzielenia\n" +
                    "q Wyjscie z programu");
            chosenOption = in.nextLine();
            if(chosenOption.equals("q")){
                turnOff = true;
                calculateSucces = false;
                System.out.println("Bye Bye");
                break;
            }
            System.out.println("Podaj dwie liczby oddzielone spacja i wcisnij enter");
            firstNumber = in.nextDouble();
            secondNumber = in.nextDouble();

            switch (chosenOption) {
                case "+":
                    resoult = firstNumber + secondNumber;
                    break;
                case "-":
                    resoult = firstNumber - secondNumber;
                    break;
                case "/":
                    resoult = firstNumber / secondNumber;
                    break;
                case "*":
                    resoult = firstNumber * secondNumber;
                    break;
                case "%":
                    resoult = firstNumber % secondNumber;
                    break;

                default:
                    System.out.println("Proboj jeszcze raz");
                    calculateSucces = false;
                    break;
            }
            if (calculateSucces) {
                System.out.println("Kalkulator obliczyl wartosc: " + resoult);
            }
        }


    }
}
