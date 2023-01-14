package com.rakovets.course.java.core.practice.oop_classes_and_objects.task01_time;

public class Time {
    private long hours;
    private int minutes;
    private int seconds;
    final int UPPER_LIMIT = 60;
    final int LOW_LIMIT = 0;

    public Time(long totalSeconds) {
        this.hours = totalSeconds / Constant.SECONDS_IN_HOUR.getNumber();
        this.minutes = (int) (totalSeconds % Constant.SECONDS_IN_HOUR.getNumber() / Constant.MINUTE_IN_HOUR.getNumber());
        this.seconds = (int) totalSeconds % Constant.SECONDS_IN_MINUTE.getNumber();
    }

    public Time(long hours, int minutes, int seconds) {
        if (minutes > UPPER_LIMIT || minutes < LOW_LIMIT
                || seconds > UPPER_LIMIT || seconds < LOW_LIMIT) {
            throw new IllegalArgumentException("minutes and seconds should not be more than 60 and less than 0");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public long getHours() {
        return hours;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public long getTotalSeconds() {
        return  hours * Constant.SECONDS_IN_HOUR.getNumber() +
                (long) minutes * Constant.SECONDS_IN_MINUTE.getNumber() + seconds;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
