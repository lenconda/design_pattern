package top.lenconda.design_pattern.task2.task2_8;

public class DrawAdapter extends DrawCircle {
    private DrawAngle drawAngle;

    public DrawAdapter() {}

    public DrawAdapter(DrawAngle angle) {
        this.drawAngle = angle;
    }

    public void insert(String msg) {
        System.out.print("DrawCircle: ");
        drawAngle.insert(msg);
    }
}
