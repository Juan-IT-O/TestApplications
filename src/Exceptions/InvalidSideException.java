package Exceptions;

public class InvalidSideException extends Exception {

    private String message = "podane pole ma niepoprawna wartosc";

    @Override
    public String getMessage() {
        return message;
    }
}
