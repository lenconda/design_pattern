package top.lenconda.design_pattern.task1.task1_2.task1_2_1;

public class ShapeFactory {
    public Shape createShape(String arg) {
        if (arg.equals("circle")) {
            return new Circle();
        } else if (arg.equals("rectangle")) {
            return new Rectangle();
        } else if (arg.equals("square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
