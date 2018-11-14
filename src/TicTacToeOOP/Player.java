package TicTacToeOOP;

public class Player {
    private String name;
    private int result;
    Mark mark;

    public Player(String name, Mark mark) {
        this.name = name;
        this.result = 0;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }

    public Mark getMark() {
        return mark;
    }

    public void incrementResult(){
        result++;
    }
}
