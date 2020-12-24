package top.lenconda.design_pattern.task2.task2_8;

public class Main {
    public static void main(String args[]) {
        CircleTarget circleTarget = (CircleTarget) new DrawCircle();
        AngleTarget angleTarget = new DrawAngle();
        String msg = "leg";
        circleTarget.insert(msg);
        angleTarget.insert(msg);
        System.out.println();
        Adapter adapter = new Adapter(circleTarget, angleTarget);
        adapter.insert(msg);

        DrawAngle drawAngle = new DrawAngle();
        DrawCircle drawCircle = (DrawCircle) new DrawAdapter(drawAngle);
        drawCircle.insert("leg");
    }
}
