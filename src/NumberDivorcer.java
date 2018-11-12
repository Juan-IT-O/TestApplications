import java.util.Scanner;

public class NumberDivorcer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tableSize, sumValidator;
        int[] inputTable;
        boolean eliminationComplete = false, eliminationPerformed;
        System.out.println("ile elementow zamierzasz wprowadzic?");
        tableSize = in.nextInt();
        inputTable = new int[tableSize];
        for (int i = 0; i < tableSize; i++) {
            System.out.println("Podaj " + i + " element");
            inputTable[i] = in.nextInt();
        }
        System.out.println("Podaj sume do jakiej maj sie sumowac pary liczb");
        sumValidator = in.nextInt();

       while (!eliminationComplete) {
            eliminationPerformed = false;
            for (int i = 0; i < inputTable.length-1; i++) {
                for (int j = i + 1; j < inputTable.length; j++) {
                    if ((inputTable[i] + inputTable[j]) == sumValidator) {
                        eliminationPerformed = true;
                        inputTable = deleteElementFromTable(inputTable,j);
                    }
                }
            }
            if (!eliminationPerformed) {
                eliminationComplete = true;
            }

        }

        System.out.println("tabela wynikow: ");
        for (int number : inputTable) {
            System.out.print(number + " ");
        }
        System.out.println();

    }

    static int[] deleteElementFromTable(int[] editedtable, int indexToRemove ){

        int[] newTable = new int[editedtable.length-1];
        for (int i = 0; i < indexToRemove; i++) {
            newTable[i] = editedtable[i];
        }
        for (int i = indexToRemove; i < editedtable.length -1; i++) {
            newTable[i] = editedtable[i+1];
        }
        return newTable;
    }

}
