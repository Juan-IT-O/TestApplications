import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Helloooooooo");
        int myNumber = 10;
        long myNumber1 = 100;
        float myNumber2 = 1000.0f;
        double myNumber3 = 10000.0d;
        String myText = "Liczbyyyyyyy";
        char myChar = '@';

        double myFrankenVar = myNumber + myNumber2 + myNumber3 / 5.0;
        myFrankenVar = myFrankenVar - 1;
        myFrankenVar -= 1;
        myFrankenVar /= 3;
        myFrankenVar %= 78;

        byte result = (byte) (myNumber + myNumber);
        int myCastedFloat = (int) 10.456d;
        System.out.println(myCastedFloat);
        System.out.println(myNumber + "" + myNumber1 + "" + myNumber2 + "" + myNumber3 + " "
                + myText + " " + myChar + " " + myFrankenVar);


    }
}
