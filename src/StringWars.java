/*
Istnieją dwie grupy walczących liter. Napisz program, który wczytuje String rozgrywki składający się z liter oraz decyduje, która grupa zwyciężyła turę.
    Lewa strona:
     w - 4
     p - 3
     b - 2
     s - 1
    Prawa strona:
     m - 4
     q - 3
     d - 2
     z - 1
     Pozostałe litery nie mają znaczenia w rozgrywce.
     Przykład: "zdqmwpbs"
     Przydatna będzie metoda: String.toCharArray

    8.1 W Stringu mogą się znaleźć również bomby - znaki '*', które wymazują przyległe litery, na przykład:
        aa*aa => a__a
        **aa** => ____

    Przykład stringów:
        zzzz*s*
        www*www****z
        *zd*qm*wp*bs*
 */


import java.util.Scanner;

public class StringWars {
    public static void main(String[] args) {
        int leftResult = 0, rightResult = 0;
        Object[][] leftWinChar, rightWinChar;
        char[] warCharTable;

        leftWinChar = setWinningCondition(readNumberFromConsole("Lewa"), "Lewa");
        rightWinChar = setWinningCondition(readNumberFromConsole("Prawa"), "Prawa");
        warCharTable = readStringFromConsole().toCharArray();
        System.out.println("Wprowadzony string: "+ new String(warCharTable));
        System.out.println("String po wybuchu: "+ new String(warCharTable));
        leftResult = checkSideFightResult(leftWinChar, warCharTable);
        rightResult = checkSideFightResult(rightWinChar, warCharTable);

        printResult(leftResult, rightResult);

    }

    static String readStringFromConsole() {
        System.out.println("Podaj String biorcy udzial w wielkiej wojnie: \n");
        Scanner in = new Scanner(System.in);
        String readedString = in.nextLine();
        return readedString;
    }

    static Object[][] setWinningCondition(int numberOfWinningCond, String side) {
        Object[][] winningCond = new Object[numberOfWinningCond][2];
        System.out.println("Podaj symbole wygrywajace dla strony " + side + " oraz ilosc punktow za dany symbol np. w5 p6 d5 s2: \n");
        int condCounter = 0;
        char[] charArray = readCharsAsArrayFromConsole();
        System.out.println(charArray.length);
        for (int i = 0; i < numberOfWinningCond; i++) {
            winningCond[i][0] = charArray[condCounter];
            condCounter++;
            winningCond[i][1] = Character.getNumericValue(charArray[condCounter]);
            condCounter += 2;
        }

        return winningCond;
    }


    static char[] readCharsAsArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toCharArray();
    }

    static int readNumberFromConsole(String side) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wygrywajacych znakow dla strony " + side + ": ");
        return scanner.nextInt();
    }

    static int checkSideFightResult(Object[][] winningCond, char[] warCharTable) {
        int result = 0;
//todo trzeba opracowac warunki brzegowe dla pierwszej i ostatniej bomby
        for (int i = 0; i < warCharTable.length; i++) {
            for (int j = 0; j < winningCond.length; j++) {
                //fixme tutaj prawdopodobnie jest blad - sprawdzanie gwiazki powinno byc gwiazdke wyzej???
                if (warCharTable[i] == (char) winningCond[j][0] && (warCharTable[i-1]!='*' || warCharTable[i+1]!='*')) {
                    result += (int) winningCond[j][1];
                }

            }
        }

        return result;
    }

    static void printResult(int leftResult, int rightResult) {
        System.out.println("--------------WYNIK TO----------------\n");
        System.out.println("               " + leftResult + ':' + rightResult + "                     ");
        if (leftResult > rightResult) {
            System.out.println("+++++++==========_____Lewy wygrywa_____===========++++++++++");
        } else if (leftResult < rightResult) {
            System.out.println("+++++++==========_____Prawy wygrywa_____===========++++++++++");
        } else {
            System.out.println("+++++++==========_____REMIS_____===========++++++++++");
        }
    }


    static char[] deleteElementFromTable(char[] editedtable, int startingIndex, int endingIndex) {

        char[] newTable = new char[editedtable.length - (endingIndex-startingIndex)];
        for (int i = 0; i < startingIndex; i++) {
            newTable[i] = editedtable[i];
        }
        for (int i = endingIndex; i < editedtable.length - 1; i++) {
            newTable[i] = editedtable[i + 1];
        }
        return newTable;
    }

}
