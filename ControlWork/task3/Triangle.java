package ControlWork.task3;

public class Triangle extends Polygon implements Shape {

    public Triangle(double lengthOfSides) {
        super(3, lengthOfSides);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * lengthOfSides * lengthOfSides;
    }

    @Override
    public double getPerimeter() {
        return 3 * lengthOfSides;
    }
}
