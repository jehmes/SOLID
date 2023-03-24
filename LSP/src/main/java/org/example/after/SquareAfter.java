package org.example.after;

public class SquareAfter implements Shape {
    protected double side;
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
