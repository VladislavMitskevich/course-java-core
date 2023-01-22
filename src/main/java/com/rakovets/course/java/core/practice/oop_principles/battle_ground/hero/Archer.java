package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

public class Archer extends Hero {
    private final static int ARCHER_HEALTH = 250;
    private final static DamageType[] damageTypes = {DamageType.PHYSICAL, DamageType.LONG_RANGE};

    public Archer(String name) {
        super(name, damageTypes, ARCHER_HEALTH);
    }

    @Override
    public void attack(Fighter fighter) {
        System.out.println(this.toString() + " attaks " + fighter.toString());
        fighter.takeDamage(this);
    }

    @Override
    public void takeDamage(Fighter fighter) {
        int dodge = (int) Math.random() * 100;
        if (dodge <= 50) {
            super.takeDamage(fighter);
        } else {
            System.out.println(this.getName() +" dodged");
        }
        if (isAlive()) {
            attack(fighter);
        } else {
            System.out.println(fighter + " killed archer" + this.getName());
        }
    }

    @Override
    public int getDamageAmount() {
        //TODO random Damage
        return 8;
    }

    @Override
    public String toString() {
        return getName();
    }
}
