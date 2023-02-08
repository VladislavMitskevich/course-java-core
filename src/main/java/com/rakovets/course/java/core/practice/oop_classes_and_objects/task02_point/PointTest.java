package com.rakovets.course.java.core.practice.oop_classes_and_objects.task02_point;

public class PointTest {
    public static void main(String[] args) {
        Point pointNumberOne = new Point(1878769, 75686);
        Point pointNumberTwo = new Point(55455, 956858);
        System.out.printf("%.2f", pointNumberOne.getDistance(pointNumberTwo));
    }
}
