package TicTacToeOOP;

public class Board {
    private char[][] gameBoard;

    public Board() {
        gameBoard = new char[3][3];
    }

    public boolean addChar(int rowCoordinate, int colCoordinate, char symbol) {
        if (symbol != 'X' && symbol != 'O') {
            System.out.println("Plansza przyjmuje tylko X lub O");
            return false;
        } else {
            if (rowCoordinate > 3 || rowCoordinate < 0 || colCoordinate > 3 || colCoordinate < 0) {
                System.out.println("Tablica 3x3 nie wolno zapisywac znaku poza nia");
                return false;
            } else {
                gameBoard[rowCoordinate][colCoordinate] = symbol;
                return true;
            }
        }
    }

    public void printBoard() {
        System.out.println(" -------------");
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " | ");
            }
            System.out.println("\n -------------");
        }
    }

}
