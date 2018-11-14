package TicTacToeOOP;

public class InvalidValueException extends Exception {
    private String message = "Podano nieprawidlowa wartosc";

    public String getMessage(){
        return message;
    }
}
