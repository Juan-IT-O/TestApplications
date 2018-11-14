package TicTacToeOOP;

public class TicTacToeOOP {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        int boardSize = consoleReader.readBoardSize();
        Game game = new Game(boardSize);
        game.playGame();
    }


}
