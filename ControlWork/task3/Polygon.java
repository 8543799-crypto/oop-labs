package ControlWork.task3;

public abstract class Polygon {
    protected int numberOfSides;
    protected double lengthOfSides;

    public Polygon(int numberOfSides, double lengthOfSides) {
        this.numberOfSides = numberOfSides;
        this.lengthOfSides = lengthOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double getLengthOfSides() {
        return lengthOfSides;
    }
}
