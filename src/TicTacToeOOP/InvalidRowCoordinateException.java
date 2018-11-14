package TicTacToeOOP;

public class InvalidRowCoordinateException extends InvalidValueException{
    private String message = "Wartosc wiersza wykracza poza dopuszczalny zakres";

    public String getMessage(){
        return message;
    }
}
