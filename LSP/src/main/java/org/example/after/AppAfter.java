package org.example.after;


public class AppAfter {
    public static void main(String[] args) {
        RectangleAfter rectangle = new RectangleAfter();
        rectangle.setHeight(5);
        rectangle.setWidth(10);
        System.out.println(rectangle.getArea());

        SquareAfter square = new SquareAfter();
        square.setSide(5);
        System.out.println(square.getArea());
    }
}
