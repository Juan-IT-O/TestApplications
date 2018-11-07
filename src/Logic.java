public class Logic {
    public static void main(String[] args) {
        boolean isCircle = true;
        double r = 5.37;
        boolean isBigCircle = isCircle && r > 10;

        if (isBigCircle) {
            System.out.println("to jest duze kolo");
        } else if (isCircle)
            System.out.println("to jest male kolo");
        else {
            System.out.println("to nie jest kolo");
        }
    }
}
