package top.lenconda.design_pattern.task2.task2_8;

public class DrawAngle implements AngleTarget {
    public DrawAngle() {}

    @Override
    public void insert(String msg) {
        System.out.println("DrawAngle insert(): " + msg);
    }
}
