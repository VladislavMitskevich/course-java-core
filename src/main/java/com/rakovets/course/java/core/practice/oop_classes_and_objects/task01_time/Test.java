package com.rakovets.course.java.core.practice.oop_classes_and_objects.task01_time;

public class Test {
    public static void main(String[] args) {
        Time time1 = new Time(3661);
        System.out.println(time1);
        Time time2 = new Time(5671968L, 6, 59);
        System.out.println(time2);
        System.out.println("total seconds = " + time2.getTotalSeconds());
    }
}
