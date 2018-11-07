import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MaxSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] inputTable = new int[3];
        int max = -2147483648;
        boolean repeated = false;
        int repeatCount = 1;
        for (int i=0; i<3; i++){
            System.out.println("Podaj liczbe: ");
            inputTable[i]=in.nextInt();
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
}
