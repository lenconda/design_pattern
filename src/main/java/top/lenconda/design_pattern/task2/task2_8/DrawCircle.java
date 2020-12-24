package top.lenconda.design_pattern.task2.task2_8;

public class DrawCircle implements CircleTarget {
    public DrawCircle() {}

    @Override
    public void insert(String msg) {
        System.out.println("DrawCircle insert(): " + msg);
    }
}
