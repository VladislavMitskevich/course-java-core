package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public enum HappinessFromCat {
    CAT_MEW(-12.5),
    CAT_PURR(25.0),
    SIAMESE_MEW(-10.0),
    SIAMESE_PURR(45),
    PERSIAN_MEW(-0.5),
    PERSIAN_PURR(60),
    SPHYNX_MEW(-40),
    SPHYNX_PURR(7.5);

    private final double nominal;

    HappinessFromCat(double nominal) {
        this.nominal = nominal;
    }

    public double getNominal() {
        return nominal;
    }
}
