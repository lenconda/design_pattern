package top.lenconda.design_pattern.task1.task1_2.task1_2_2;

public class CircleShapeFactory extends ShapeFactory {
    @Override
    public Circle create() {
        return new Circle();
    }
}
