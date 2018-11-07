import java.util.concurrent.TimeUnit;

public class Tables {
    public static void main(String[] args) {
        int zCoordinatesCount = 1000;
        int[] yCoordinates = {1,2,3,4,5,6,7,8,9,10};
        int[] xCoordinates = new int[5];
        xCoordinates[0] = 1;
        xCoordinates[1] = 2;
        xCoordinates[2] = 3;
        xCoordinates[3] = 4;
        xCoordinates[4] = 5;
        System.out.println(xCoordinates[3]);

        //dynamiczna alokacja tablicy
        int[] zCoordinates = new int[zCoordinatesCount];

        for (int i=0;i<zCoordinatesCount;i++){
            zCoordinates[i]=zCoordinatesCount-i;
            System.out.println(zCoordinates[i]);
            try {
                TimeUnit.MICROSECONDS.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int sum = 0;
        for(int yCoordinate : yCoordinates){
            sum+=yCoordinate;
            System.out.println(sum);
        }
    }
}
