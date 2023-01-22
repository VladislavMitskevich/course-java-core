package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat{

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew(){
        return "meaw, meaw, meaw";
    }

    @Override
    public String mew(Person owner){
        owner.changeHappiness(HappinessFromCat.SIAMESE_MEW.getNominal());
        return "meaw, meaw, meaw";
    }

    @Override
    public String purr(){
        return "purrrr, purrrrrr";
    }

    @Override
    public String purr(Person owner){
        owner.changeHappiness(HappinessFromCat.SIAMESE_PURR.getNominal());
        return "purrrr, purrrrrr";
    }
}
