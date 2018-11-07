import static java.lang.Math.*;

public class TimeTest {

    enum Hemisphere {
        WEST, EAST
    }

    public static void main(String[] args) {

        double myPoint = 98.123;
        double destPoint = 123.123;
        int myTimeHour = 10;
        int myTimeMin = 24;
        int destTimeHour, destTimeMinutes;
        final int minutesPerDeg = 4;

        boolean isDestBigger = destPoint > myPoint;
        Hemisphere myHemisphere = Hemisphere.EAST;
        Hemisphere destHemisphere = Hemisphere.WEST;
//todo zastanowic sie nad polkolami linia zmiany daty i godzinami ujemnymi.
        if (myHemisphere == destHemisphere) {
            int timeDiffMinutes;
            timeDiffMinutes = (int) (destPoint - myPoint) * minutesPerDeg;

            if (isDestBigger) {
                destTimeMinutes = myTimeMin + timeDiffMinutes % 60;
                destTimeHour = myTimeHour + timeDiffMinutes / 60;
                if (destTimeMinutes > 60) {
                    destTimeHour += destTimeMinutes / 60;
                    destTimeMinutes = destTimeMinutes % 60;
                }

            } else {

                destTimeMinutes = myTimeMin - timeDiffMinutes % 60;
                destTimeHour = myTimeHour - timeDiffMinutes / 60;
                if (destTimeMinutes < 0 && destTimeMinutes < -59) {
                    destTimeHour -= abs(destTimeMinutes / 60);
                    destTimeMinutes = abs(destTimeMinutes % 60);
                } else {
                    destTimeMinutes = abs(destTimeMinutes);

                }


            }


        }

    }

}
