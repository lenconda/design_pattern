package top.lenconda.design_pattern.task1.task1_2.task1_2_1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ShapeFactory shapeFactory = new ShapeFactory();
        String inputShapeType = "";

        while (!inputShapeType.equals("exit")) {
            System.out.print("Enter a shape type: ");
            inputShapeType = scanner.nextLine();
            Shape shape = shapeFactory.createShape(inputShapeType);
            if (shape != null) {
                shape.draw();
                shape.erase();
            }
        }
    }
}
