public class MultiTables {
    public static void main(String[] args) {
        char[][] gameBoard = new char[10][10];


        for(char[] outerTab:gameBoard){
            for(char innerTab: outerTab){
                System.out.print(innerTab);
            }
            System.out.println("---------");

        }

        //zainicjowana tablica niezainicjowanych tablic (trzeba je zainicjowac recznie w petli)
        int[][] gameBoard2 = new int[10][];
        for (int i=0; i<10;i++){
            gameBoard2[i]=new int[5];
        }
    }
}
