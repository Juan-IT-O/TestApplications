package Inheritance;

public class Square extends Rectangle {

    public Square(String color, double sideA) {
        super(color, sideA, sideA);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {

            if (obj instanceof Square) {
                if (((Square) obj).getSideA() == this.getSideA()) {
                    if (((Square) obj).getSideB() == this.getSideB()) {
                        return true;
                    }else{
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}

