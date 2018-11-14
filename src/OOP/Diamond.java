package OOP;

public class Diamond extends Figure{
    private double firstDiagonal,secondDiagonal,a;

    public Diamond(String color){
        super(color);
        firstDiagonal = a/10;
        secondDiagonal = a/5;
        this.color = "czerwony";
    }
    public Diamond(double firstDiagonal, double secondDiagonal, double a){
        super("blue");
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
        this.a = a;
    }

    double countArea(){
        return firstDiagonal*secondDiagonal;
    }

}
