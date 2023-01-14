package com.rakovets.course.java.core.practice.oop_classes_and_objects.task01_time;

public enum Constant {
    SECONDS_IN_MINUTE(60),
    SECONDS_IN_HOUR (3600),
    MINUTE_IN_HOUR (60);
    private final int number;

    public int getNumber() {
        return number;
    }

    Constant(int number) {
        this.number = number;
    }
}
