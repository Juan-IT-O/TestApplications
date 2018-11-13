package TicTacToeOOP;

public class TicTacToeOOP {

    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
        board.addChar(1,1,'X');
        board.printBoard();

    }


}
