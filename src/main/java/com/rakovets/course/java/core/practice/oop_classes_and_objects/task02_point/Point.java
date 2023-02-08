package com.rakovets.course.java.core.practice.oop_classes_and_objects.task02_point;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Point point) {
        double horizontalLeg = Math.abs(x - point.getX());
        double verticalLeg = Math.abs(y - point.getY());
        double squareOfHorizontalLeg = Math.pow(horizontalLeg,2);
        double squareOfVerticalLeg= Math.pow(verticalLeg,2);
        return Math.sqrt(squareOfHorizontalLeg+squareOfVerticalLeg);
    }
}
