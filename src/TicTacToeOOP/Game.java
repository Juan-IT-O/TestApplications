package TicTacToeOOP;

public class Game {
    private ConsoleReader consoleReader;
    private Board gameBoard;
    private Player playerX, playerO, activePlayer;
    private boolean isGameOver = false;
    private int boardsize;
    public Game(int boardsize) {
        consoleReader = new ConsoleReader();
        this.boardsize=boardsize;
    }

    public void playGame() {
        initializePlayers();

        while(!isGameOver){
            isGameOver=playTurn(playerX,playerO,boardsize);
        }

        System.out.println("Wygrywa "+ activePlayer.getName()+ " z wynikiem: " + activePlayer.getResult());
    }
    public boolean playTurn(Player firstPlayer, Player secondPlayer, int boardsize){
        gameBoard = new Board(boardsize);
        Result result = Result.LACK;
        while (result == Result.LACK) {
            activePlayer = (activePlayer.equals(playerX) ? playerO : playerX);
            makeMove(activePlayer);
            System.out.println(gameBoard);
            result = gameBoard.checkForWinner();

        }
        activePlayer.incrementResult();
        return consoleReader.readIsNextTurn();


    }

    public void initializePlayers() {
        playerX = new Player(consoleReader.readName(), Mark.X);
        playerO = new Player(consoleReader.readName(), Mark.O);
        activePlayer = playerO;
    }

    public void makeMove(Player player) {
        boolean isMoveCorrect = false;
        int rowCoordinate, colCoordinate;
        while (!isMoveCorrect) {
            System.out.println("Player: "+ activePlayer.getName()+ "'s turn:");
            rowCoordinate = consoleReader.readCoordinate(Coordinate.ROW);
            colCoordinate = consoleReader.readCoordinate(Coordinate.COL);
            isMoveCorrect = gameBoard.addChar(rowCoordinate, colCoordinate, player.getMark());
        }
    }

}

