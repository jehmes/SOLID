package org.example.before;

public class Rectangle {
    protected double width;
    protected double height;

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return height * width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
