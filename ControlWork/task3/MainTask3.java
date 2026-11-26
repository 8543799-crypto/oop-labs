package ControlWork.task3;

public class MainTask3 {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        drawing.addShape(new Rectangle(4, 5));
        drawing.addShape(new Circle(3));
        drawing.addShape(new Triangle(6));
        drawing.addShape(new Pentagon(4));

        drawing.printShapesInfo();

        drawing.addShape(new Rectangle(2, 8));
        drawing.addShape(new Circle(5));

        System.out.println();
        drawing.printShapesInfo();
    }
}
