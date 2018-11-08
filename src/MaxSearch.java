import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MaxSearch {

    public static void main(String[] args) {
        //TODO zaimplementowafunkcje
        Scanner in = new Scanner(System.in);
        int[] inputTable = new int[3];
        int max = -2147483648;
        boolean repeated = false;
        int repeatCount = 1;
        for (int i=0; i<3; i++){
            inputTable[i]=readNumberFromConsole(i);
        }

        for(int i=0;i<3; i++){
            if(inputTable[i]>max){
                max=inputTable[i];
            }else if(inputTable[i]==max){
                repeated=true;
                repeatCount++;
            }
        }

        System.out.print("Najwieksza wartosc to: " + max +" ");
        if(repeated){
            System.out.println("Wystepuja " + repeatCount+ " powtorzenia tej wartosci");
        }


    }
    static int readNumberFromConsole(int numberInOrder){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe "+numberInOrder+": " );
        return scanner.nextInt();
    }

    static int[] findGreatestNumbers(int... numbers){

        int greatest = numbers[0];
        greatest = findGreatest(greatest, numbers);

        int[] result = new int[getGreatestCount(greatest, numbers)];
        for (int i = 0; i< getGreatestCount(greatest, numbers); i++) {
            result[i] = greatest;
        }
        return result;
    }

    private static int getGreatestCount(int greatest, int[] numbers) {
        int greatestCount = 0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]==greatest){
                greatestCount++;
            }
        }
        return greatestCount;
    }

    private static int findGreatest(int greatest, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>greatest){
                greatest=numbers[i];
            }
        }
        return greatest;
    }

}
