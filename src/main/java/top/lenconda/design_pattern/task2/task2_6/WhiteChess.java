package top.lenconda.design_pattern.task2.task2_6;

public class WhiteChess implements Chess {
    private final String color;

    public WhiteChess(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void display(Position position) {
        System.out.println("White chess " + position.position());
    }
}
