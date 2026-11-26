package ControlWork.task3;

public class Pentagon extends Polygon implements Shape {

    public Pentagon(double lengthOfSides) {
        super(5, lengthOfSides);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) / 4) * lengthOfSides * lengthOfSides;
    }

    @Override
    public double getPerimeter() {
        return 5 * lengthOfSides;
    }
}
