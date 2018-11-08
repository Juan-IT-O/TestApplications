public class RecursiveFunction {

    public static void main(String[] args) {
        System.out.println(recursiveFunction(10,""));
    }

    static String recursiveFunction(int iterator, String myString){
        if(iterator > 0){
            System.out.println("iterator value " + iterator);
            return recursiveFunction(iterator -1, myString+" "+ iterator);
        }else{
            System.out.println("recursive function is over");
            return myString;
        }



    }
}
