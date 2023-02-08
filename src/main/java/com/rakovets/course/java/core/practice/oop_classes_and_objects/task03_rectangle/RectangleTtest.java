package com.rakovets.course.java.core.practice.oop_classes_and_objects.task03_rectangle;

public class RectangleTtest {
    public static void main(String[] args) {
        PointToRectangle topLeftPoint = new PointToRectangle(9,1);
        PointToRectangle bottomRightPoint = new PointToRectangle(7,5);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        System.out.printf("%.2f",rectangle.getArea());
        System.out.printf("%.2f",rectangle.getPerimeter());
    }
}
