package TicTacToeOOP;

public class Game {
    private ConsoleReader consoleReader;
    private Board gameBoard;
    private Player playerX, playerO, active;
    private Result result;

    public Game(int boardsize) {
        consoleReader = new ConsoleReader();
        gameBoard = new Board(boardsize);
        result = Result.LACK;
    }

    public void play() {
        while (result==Result.LACK){

        }
    }
}

