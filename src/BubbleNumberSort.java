import java.util.Scanner;

public class BubbleNumberSort {
    public static void main(String[] args) {
        int[] inputNumbers= getNumbersFromConsoleAsArray("Podaj wszystkie numery do sortowania oddzielone spacją, żeby zakończyć wpisz q i wciśnij enter");
        int[] sortedArr = bubbleSorter(inputNumbers);
        System.out.println("Posortowano wszystkie liczby. Wynikowa tablica poniżej\n");

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i]+" ");
        }

    }

    private static int[] getNumbersFromConsoleAsArray(String text){
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = new int[0];
        int[] numberArr1;
        while(scanner.hasNextInt()){
            numberArr1 = new int[numberArr.length+1];
            for (int i = 0; i < numberArr.length; i++) {
                numberArr1[i]=numberArr[i];
            }
            numberArr1[numberArr.length] = scanner.nextInt();
            numberArr=numberArr1;
        }
        return numberArr;
    }

    private static int[] bubbleSorter(int[] unsortedArr){
        int[] sortedArr;
        boolean iterationWithoutSort = false;
        int memValue;
        while(!iterationWithoutSort){
            iterationWithoutSort=true;
            for (int i = 0; i < unsortedArr.length-1; i++) {

                if(unsortedArr[i]>unsortedArr[i+1]){
                    memValue=unsortedArr[i];
                    unsortedArr[i]=unsortedArr[i+1];
                    unsortedArr[i+1]=memValue;
                    iterationWithoutSort=false;
                }

            }

        }
        sortedArr=unsortedArr;
        return sortedArr;

    }
}
