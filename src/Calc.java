import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        char chosenOption;
        double[] inputTable;
        double result;


        while (true) {
            chosenOption=chooseOption();

            if (exitCondition(chosenOption)) {
                System.out.println("Bye Bye");
                break;
            }
            inputTable = readNumbersFromConsole(2);
            inputTable = addFlagToTable(inputTable);
            result = Calculate(inputTable, chosenOption);

            if (inputTable[2]==1) {
                System.out.println("Kalkulator obliczyl wartosc: " + result+"\n");
            }

        }


    }

    static char chooseOption() {
        System.out.println("podaj symbol odpowiadajacy operacji do wykonania:\n\n" +
                "+ Dodawanie\n" +
                "- Odejmowanie\n" +
                "/ Dzielenie\n" +
                "* Mnozenie\n" +
                "% Reszta z dzielenia\n" +
                "q Wyjscie z programu\n");

        return readCharFromConsole();
    }

    static char readCharFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }

    static boolean exitCondition(char symbol){
        return symbol == 'q';
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
    static double[] addFlagToTable(double[] oldTable){
        double[] tableWithFlagAdded = new double[oldTable.length+1];
        for (int i = 0; i < oldTable.length ; i++) {
            tableWithFlagAdded[i]=oldTable[i];
        }
        tableWithFlagAdded[oldTable.length] = 1;
        return tableWithFlagAdded;
    }

    static double Calculate(double[] inputTable, char chosenOption){
        double result=0;
        switch (chosenOption) {
            case '+':
                result = inputTable[0] + inputTable[1];
                break;
            case '-':
                result = inputTable[0] - inputTable[1];
                break;
            case '/':
                result = inputTable[0] / inputTable[1];
                break;
            case '*':
                result = inputTable[0] * inputTable[1];
                break;
            case '%':
                result = inputTable[0] % inputTable[1];
                break;

            default:
                System.out.println("Proboj jeszcze raz");
                inputTable[2]=0;
                break;
        }

        return result;
    }

}

