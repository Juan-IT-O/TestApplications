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
        int leftResult=0,rightResult=0;
        Object[][] leftWinChar, rightWinChar;

        leftWinChar = setWinningCondition(readNumberFromConsole());

        char[] warCharTable = readStringFromConsole().toCharArray();


    }

    static String readStringFromConsole (){
        System.out.println("Podaj String biorcy udzial w wielkiej wojnie: \n");
        Scanner in = new Scanner(System.in);
        String readedString = in.nextLine();
        return readedString;
    }

    static Object[][] setWinningCondition(int numberOfWinningCond){
        Object[][] winningCond = new Object[numberOfWinningCond][2];
        for (int i = 0; i < numberOfWinningCond; i++) {
            System.out.println("Podaj symbol wygrywajacy oraz ilosc punktow za dany symbol np. w5: \n");
            char[] charArray = readCharsAsArrayFromConsole();
            winningCond[i][0] = charArray[0];
            winningCond[i][1] = charArray[1];
        }

        return  winningCond;
    }
    static char[] readCharsAsArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toCharArray();
    }

    static int readNumberFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wygrywajacych znakow: ");
        return scanner.nextInt();
    }
    static int checkSideFightResult(Object[][] winningCond, char[] warCharTable){

        for (int i = 0; i < warCharTable.length; i++) {
            for (int j = 0; j < winningCond.length; j++) {
                if(warCharTable[i] == (char) winningCond[i][j]){

                }

                String s = (String) winningCond[1][0];
                char c = (char) winningCond[1][0];
            }
        }
    }
//TODO dodac wynik
}
