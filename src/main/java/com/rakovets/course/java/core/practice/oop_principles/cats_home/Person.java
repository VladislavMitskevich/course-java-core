package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Person {
    private double happiness;

    public void changeHappiness(double percentHappiness) {
        if (percentHappiness >= 0 && this.happiness + percentHappiness <= 100
                || percentHappiness < 0 && (this.happiness + percentHappiness) >= 0) {
            this.happiness += percentHappiness;
        } else if (percentHappiness >= 0 && (this.happiness + percentHappiness) > 100) {
            this.happiness = 100;
        } else if (percentHappiness < 0 && (this.happiness + percentHappiness) < 0) {
            this.happiness = 0;
        }
    }

    public Person(double happiness) {
        setHappiness(happiness);
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        if (happiness >= 0.0 && happiness <= 100.0) {
            this.happiness = happiness;
        } else {
            throw new IllegalArgumentException("the percentage of happiness should be in the range from 0 to 100 inclusive");
        }
    }
}
