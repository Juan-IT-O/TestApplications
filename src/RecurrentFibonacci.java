public class RecurrentFibonacci {
    public static void main(String[] args) {
        System.out.println(calculateSum(20));
    }

    private static int calculateSum(int indexOfElement){
        if(indexOfElement==1||indexOfElement==2){
            return 1;
        }else {
            return calculateSum(indexOfElement - 2) + calculateSum(indexOfElement - 1);
        }
    }
}

