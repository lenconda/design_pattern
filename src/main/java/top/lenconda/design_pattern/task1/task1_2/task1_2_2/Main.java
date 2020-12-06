package top.lenconda.design_pattern.task1.task1_2.task1_2_2;

public class Main {
    public static void main(String args[]) {
        ShapeFactory circleShapeFactory = new CircleShapeFactory();
        ShapeFactory rectangleShapeFactory = new RectangleShapeFactory();
        ShapeFactory squareShapeFactory = new SquareShapeFactory();
        Shape circle = circleShapeFactory.create();
        Shape rectangle = rectangleShapeFactory.create();
        Shape square = squareShapeFactory.create();
        circle.draw();
        circle.erase();
        rectangle.draw();
        rectangle.erase();
        square.draw();
        square.erase();
    }
}
