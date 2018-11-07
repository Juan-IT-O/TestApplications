import java.util.Scanner;

public class SqrtSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nValue;
        int sqrtSum=0;

        System.out.println("Podaj dlugosc ciagu");
        nValue = in.nextInt();
        if (nValue<0){
            System.out.println("Podales ujemna liczbe - program poda sume dla wartosci bezwzglednej z tej liczby");
            nValue=Math.abs(nValue);
        }

        for(int i=0;i<=nValue;i++){
            sqrtSum+=Math.pow(i,2);
        }

        System.out.println("Suma kwadratow elementow ciagu naturalnego o wielkosci "+ nValue+" wynosi " + sqrtSum);
    }
}
