package OOP;

public abstract class Figure {
    protected String color;

    public Figure(String color){
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
