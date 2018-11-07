import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int fibonacciPrev = 0;
        int fibonacciPrevPrev = 0;
        int fibonacciSum = 0;
        int nValue;
        System.out.println("Ktory element ciagu fibonacciego cie interesuje?");
        nValue = in.nextInt();
        if (nValue<0){
            System.out.println("Podales ujemna liczbe - program poda sume wartosci bezwzglednej z tej liczby");
            nValue=Math.abs(nValue);
        }

        if(nValue==0||nValue==1){
            System.out.println("element: "+ nValue+ " wynosi 1");
        }else{
            fibonacciPrev=1;
            fibonacciPrevPrev=1;
            for(int i=2; i<nValue;i++){
                fibonacciSum=fibonacciPrev+fibonacciPrevPrev;
                fibonacciPrevPrev=fibonacciPrev;
                fibonacciPrev=fibonacciSum;
            }
            System.out.println("wartosc elementu "+ nValue+" wynosi: "+fibonacciSum);
        }


    }

}
