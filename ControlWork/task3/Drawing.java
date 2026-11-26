package ControlWork.task3;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Shape> shapes;

    public Drawing() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public double calculateTotalArea() {
        double total = 0;
        for (Shape s : shapes) {
            total += s.getArea();
        }
        return total;
    }

    public double calculateTotalPerimeter() {
        double total = 0;
        for (Shape s : shapes) {
            total += s.getPerimeter();
        }
        return total;
    }

    public void printShapesInfo() {
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + ": area = " + s.getArea() + ", perimeter = " + s.getPerimeter());
        }
        System.out.println("Total area: " + calculateTotalArea());
        System.out.println("Total perimeter: " + calculateTotalPerimeter());
    }
}
