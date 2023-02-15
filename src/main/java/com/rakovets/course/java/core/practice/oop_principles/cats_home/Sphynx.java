package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "myaaaaaw, myaaaaaw, myw";
    }

    @Override
    public String mew(Person owner) {
        owner.changeHappiness(HappinessFromCat.SPHYNX_MEW.getNominal());
        return "myaaaaaw, myaaaaaw, myw";
    }

    @Override
    public String purr() {
        return "prrrr, prrrrrr";
    }

    @Override
    public String purr(Person owner) {
        owner.changeHappiness(HappinessFromCat.SPHYNX_PURR.getNominal());
        return "prrrr, prrrrrr";
    }
}
