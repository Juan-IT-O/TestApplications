package Inheritance;

public abstract class Figure implements AreaCountable {
protected String color;

public Figure(String color)
{
    this.color=color;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


