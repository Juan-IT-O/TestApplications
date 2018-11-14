package TicTacToeOOP;


public class Board {
    private Mark[][] gameBoard;

    public Board(int rows) {
        gameBoard = new Mark[rows][rows];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = Mark.EMPTY;
            }
        }
    }

    public boolean addChar(int rowCoordinate, int colCoordinate, Mark symbol) {

        if (checkFieldAvailability(rowCoordinate, colCoordinate)) {
            gameBoard[rowCoordinate][colCoordinate] = symbol;
            return true;
        } else {
            System.out.println("Blednie wprowadzone koordynaty: znak nie zostanie umieszczony");
            return false;
        }

    }

    public String toString() {
        String board = " -------------\n";
        for (int i = 0; i < gameBoard.length; i++) {
            board += " | ";
            for (int j = 0; j < gameBoard[i].length; j++) {
                switch (gameBoard[i][j]) {
                    case O: {
                        board += 'O' + " | ";
                        break;
                    }
                    case X: {
                        board += 'X' + " | ";
                        break;
                    }
                    case EMPTY: {
                        board += ' ' + " | ";
                        break;
                    }
                }

            }
            board += "\n -------------\n";
        }
        return board;
    }

    //todo
    public boolean checkFieldAvailability(int rowCoordinate, int colCoordinate) {
        if (rowCoordinate > gameBoard.length || rowCoordinate < 0) {
            return false;

        } else if (colCoordinate > gameBoard[0].length || colCoordinate < 0) {
            return false;
        } else if (gameBoard[rowCoordinate][colCoordinate] != Mark.EMPTY) {
            return false;
        } else {
            return true;
        }
    }

    public Result checkForWinner() {
        Result result;
        result=diagonalChecker();
        if(result==result.LACK){
            result = rowColChecker();
            if(result==result.LACK){
                result= tieChecker();
            }
        }
        return result;

    }

    private Result resultMatcher(Mark symbol) {
        switch (symbol) {
            case O:
                return Result.O;
            case X:
                return Result.X;
            case EMPTY:
                return Result.LACK;
            default:
                return Result.LACK;
        }
    }
    private Result rowColChecker(){
        Result result = Result.LACK;
        Mark firstMark;
        //row check
            for (int i = 0; i < gameBoard.length; i++) {
                firstMark = gameBoard[i][0];
                for (int j = 1; j < gameBoard[i].length; j++) {
                    if (gameBoard[i][j] != firstMark) {
                        result = Result.LACK;
                        break;
                    } else {
                        result = resultMatcher(firstMark);
                    }
                }
            }
        if (result != Result.LACK) {
            return result;
        }

        //col check if row check result == lack
            for (int i = 0; i < gameBoard.length; i++) {
                firstMark = gameBoard[0][i];

                for (int j = 1; j < gameBoard[i].length; j++) {
                    if (gameBoard[j][i] != firstMark) {
                        result = Result.LACK;
                        break;
                    } else {
                        result = resultMatcher(firstMark);
                    }
                }

            }


    return result;
    }

    private Result diagonalChecker(){
        Mark firstMark = gameBoard[0][0];
        Result result = Result.LACK;
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][i] != firstMark) {
                result = Result.LACK;
                break;
            } else {
                result = resultMatcher(firstMark);
            }
        }
        if (result != Result.LACK) {
            return result;
        }

        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[gameBoard.length-i-1][i] != firstMark) {
                result = Result.LACK;
                break;
            } else {
                result = resultMatcher(firstMark);
            }
        }
        return result;
    }

    private Result tieChecker(){
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                if(gameBoard[i][j]==Mark.EMPTY){
                    return Result.LACK;
                }
            }
        }
        return Result.TIE;

    }
}