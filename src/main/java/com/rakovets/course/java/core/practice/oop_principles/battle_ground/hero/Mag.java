package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DiceRoll;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

public class Mag extends Hero {
    private final static DamageType[] damageTypes = {DamageType.MAGIC, DamageType.LONG_RANGE};
    private final static int MAGUS_HEALTH = 180;
    private final static int FIRE_MANTLE = 8;

    public Mag(String name) {
        super(name, damageTypes, MAGUS_HEALTH);
    }

    @Override
    public void attack(Fighter enemy) {
        System.out.println(this.toString() + " attaks " + enemy.toString());
        enemy.takeDamage(this);
    }

    @Override
    public void takeDamage(Fighter enemy) {
        int currentHp = getHealth();
        setHealth(currentHp + FIRE_MANTLE);
        super.takeDamage(enemy);
        if (isAlive()) {
            attack(enemy);
        } else {
            System.out.println(enemy + " killed magus" + this.getName());
        }
    }

    @Override
    public int getDamageAmount() {
        int currentDamage;
        if (DiceRoll.roll100() > 80) {
            currentDamage = DiceRoll.roll12() * 5;
            System.out.println("Success of fireball");
        } else {
            currentDamage = DiceRoll.roll12() * 2;
            System.out.println("tangential hit");
        }
        return currentDamage;
    }

    @Override
    public String toString() {
        return getName();
    }
}
