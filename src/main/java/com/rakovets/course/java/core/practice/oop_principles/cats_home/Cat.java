package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public String mew() {
        return "meow, meow, moew";
    }

    public String mew(Person owner) {
        owner.changeHappiness(HappinessFromCat.CAT_MEW.getNominal());
        return "meow, meow, moew";
    }

    public String purr() {
        return "purr, purr, purr";
    }

    public String purr(Person owner) {
        owner.changeHappiness(HappinessFromCat.CAT_PURR.getNominal());
        return "purr, purr, purr";
    }


    public Cat(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
