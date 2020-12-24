package top.lenconda.design_pattern.task2.task2_6;

public class BlackChess implements Chess {
    private final String color;

    public BlackChess(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void display(Position position) {
        System.out.println("Black chess " + position.position());
    }
}
