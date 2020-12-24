package top.lenconda.design_pattern.task2.task2_6;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public  String position() {
        return "(" + x + ", " + y + ")";
    }
}
