package top.lenconda.design_pattern.task2.task2_8;

public class Adapter {
    private final CircleTarget circleTarget;
    private final AngleTarget angleTarget;

    public Adapter(CircleTarget circleTarget, AngleTarget angleTarget) {
        this.circleTarget = circleTarget;
        this.angleTarget = angleTarget;
    }

    public void insert(String msg) {
        System.out.println("DrawCircle: ");
        angleTarget.insert(msg);
    }
}
