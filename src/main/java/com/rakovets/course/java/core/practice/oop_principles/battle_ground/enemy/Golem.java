package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DiceRoll;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

import java.util.Arrays;

public class Golem extends Enemy {
    private final static DamageType[] damageTypes = {DamageType.PHYSICAL, DamageType.MELEE};
    private static final int GOLEM_HEALTH = 220;

    public Golem(int health) {
        super(health, damageTypes);
    }

    @Override
    public int getDamageAmount() {
        int damageAmount;
        if (this.getHealth() <= 20) {
            damageAmount = DiceRoll.roll10() * 4;
        } else {
            damageAmount = DiceRoll.roll10() * 2;
        }
        return damageAmount;
    }

    @Override
    public void attack(Fighter hero) {
        System.out.println(this.toString() + " attaks " + hero.toString());
        hero.takeDamage(this);
    }

    @Override
    public void takeDamage(Fighter hero) {
        super.takeDamage(hero);
        if (this.getHealth() >= 20) {
            attack(hero);
        } else if (hero.getDamageAmount() - 5 <= 0){

        }
        System.out.println(this.toString() + " get HP " + this.getHealth());
        if (isAlive()) {
            attack(hero);
        } else {
            System.out.println(this.toString() + " killed by " + hero.toString());
        }
    }

    @Override
    public String toString() {
        return "Golem";
    }
}
