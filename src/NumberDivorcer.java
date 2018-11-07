import java.util.Scanner;

public class NumberDivorcer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tableSize, firstNumber, secondNumber, sumValidator, eliminationCount = 0;
        int[] inputTable;
        int[] newTable;
        boolean eliminationComplete = false,eliminationPerformed;
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
            eliminationPerformed=false;
            for (int i = 0; i < inputTable.length; i++) {
                for (int j = i + 1; j < inputTable.length-1; j++) {
                    if ((inputTable[i] + inputTable[j]) == sumValidator) {
                        eliminationPerformed=true;
                        newTable = new int[inputTable.length - 1];
                        for (int z = 0; z < j;z++ ) {
                            newTable[z]=inputTable[z];
                        }
                        //fixme null pointer
                        for(int z=j;z<inputTable.length-1;z++){

                            newTable[z]=inputTable[z+1];
                        }
                        inputTable=newTable;
                    }
                }
            }
        if(!eliminationPerformed){
            eliminationComplete=true;
            break;
        }

        }
        System.out.println("tabela wynikow: ");
        for (int number: inputTable){
            System.out.print(number + " ");
        }
        System.out.println("");


    }
}
