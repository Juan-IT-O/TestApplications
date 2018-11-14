package TicTacToeOOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner;

    public ConsoleReader(){
        scanner= new Scanner(System.in);
    }

    public int readBoardSize(){
        System.out.println("Podaj wielkosc tablicy: ");
        return scanner.nextInt();
    }
    public String readName(){
        System.out.println("Podaj imie gracza: ");
        return scanner.nextLine();
    }
    public int readCoordinate(Coordinate coordinate){
        String msg = "";
        msg+="Podaj wartosc wspolrzednej dla ";
        if(coordinate == Coordinate.ROW) {
            msg += "wiersza: ";
        }else{
            msg += "kolumny: ";
        }
        System.out.println(msg);
        return scanner.nextInt();
    }
    public boolean readIsNextTurn(){
        System.out.println("Czy chcesz grać jeszcze raz? y/n");
        try {
            boolean isNextTurn=scanner.nextBoolean();
            return isNextTurn;
        } catch (InputMismatchException e) {
            System.out.println("Podaj właściwą wartość");
            readIsNextTurn();
        }finally {
            System.out.println("błąd niezależny wartośc domyślna - false");
            return false;
        }
    }
}
