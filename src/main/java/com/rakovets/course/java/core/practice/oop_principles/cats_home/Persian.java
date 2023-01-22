package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat{

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew(){
        return "myaw, myaw, myaw";
    }

    @Override
    public String mew(Person owner){
        owner.changeHappiness(HappinessFromCat.PERSIAN_MEW.getNominal());
        return "myaw, myaw, myaw";
    }

    @Override
    public String purr(){
        return "frrrr, frrrrrr";
    }

    @Override
    public String purr(Person owner){
        owner.changeHappiness(HappinessFromCat.PERSIAN_PURR.getNominal());
        return "frrrr, frrrrrr";
    }
}
