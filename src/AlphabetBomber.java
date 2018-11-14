import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Scanner;

public class AlphabetBomber {
    public static void main(String[] args) {
        char[] stringBomb = getStringFromConsoleAsCharArr("Tekst Bombe");
        boolean letterChecker;
        System.out.println("w alfabecie wybuchły litery "+String.copyValueOf(stringBomb));
        System.out.println("to co zostało zostanie wypisane poniżej:");
        for (int i = 97; i < 123; i++) {
            letterChecker = true;
            for (int j = 0; j < stringBomb.length; j++) {
                if((char)i==stringBomb[j]){
                    letterChecker=false;
                }
            }
            if(letterChecker){
                System.out.print((char)i + " ");
            }
        }

    }

    private static char[] getStringFromConsoleAsCharArr(String tekst){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj "+tekst+" :");
        return scanner.nextLine().toLowerCase().toCharArray();
    }



}
