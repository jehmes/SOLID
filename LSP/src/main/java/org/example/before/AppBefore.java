package org.example.before;

public class AppBefore {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(10);
        System.out.println(rectangle.getArea());

        Square square = new Square();
        square.setHeight(5);
//        square.setWidth(10);
        System.out.println(square.getArea());
    }
}
