package top.lenconda.design_pattern.task1.task1_2.task1_2_2;

public class SquareShapeFactory extends ShapeFactory {
    @Override
    public Square create() {
        return new Square();
    }
}
