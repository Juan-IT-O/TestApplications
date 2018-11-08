public class Function {


    public static void main(String[] args) {
        double[] numbers = {10.2, 15.2,45.6,4789.46};
        printCalculatedAritmAverage(numbers);
    }

    static double sumOfTableElem(double[] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum += table[i];
        }
        return sum;
    }
    static double aritmAverageOfTableElem(double[] table){
        double average;
        average = sumOfTableElem(table)/(double)table.length;
        return average;
    }

    static void printCalculatedAritmAverage(double[] table){
        System.out.println("srednia arytmetyczna wynosi: " + aritmAverageOfTableElem(table));
    }

}

