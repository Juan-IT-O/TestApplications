public class Switch {
    public static void main(String[] args) {

        Direction direction = Direction.UNKNOWN;

        switch (direction){

            case LEFT:
                System.out.println("LEFT");
                break;
            case RIGHT:
                System.out.println("RIGHT");
                break;
            case UP:
                System.out.println("UP");
                break;
            case DOWN:
                System.out.println("DOWN");
                break;
            default:
                System.out.println("Unknown");
        }
    }
    enum Direction {
        LEFT, RIGHT, UP, DOWN, UNKNOWN
    }
}
