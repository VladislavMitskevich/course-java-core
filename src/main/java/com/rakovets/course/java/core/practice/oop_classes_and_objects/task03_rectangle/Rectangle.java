package com.rakovets.course.java.core.practice.oop_classes_and_objects.task03_rectangle;

public class Rectangle {
    PointToRectangle topLeftPoint;
    PointToRectangle bottomRightPoint;

    public Rectangle(PointToRectangle topLeftPoint, PointToRectangle bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public PointToRectangle getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(PointToRectangle topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public PointToRectangle getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint(PointToRectangle bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }
    double getDistanseX() {
        double horizontalLeg = Math.abs(bottomRightPoint.getX() - topLeftPoint.getX());
        return horizontalLeg;
    }

    double getDistanseY() {
        double verticalLeg = Math.abs(bottomRightPoint.getY() - topLeftPoint.getY());
        return verticalLeg;
    }



    double getPerimeter() {
        return 2 * getDistanseY() + 2 * getDistanseX();
    }

    double getArea() {
        return  getDistanseY()*getDistanseX();
    }
}
