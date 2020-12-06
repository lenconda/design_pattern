package top.lenconda.design_pattern.task1.task1_2.task1_2_2;

public class RectangleShapeFactory extends ShapeFactory {
    @Override
    public Rectangle create() {
        return new Rectangle();
    }
}
