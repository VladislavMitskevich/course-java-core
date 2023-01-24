package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DiceRoll;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

import java.util.Arrays;

public class RedDragon extends Enemy {
    private final static DamageType[] damageTypes = {DamageType.MAGIC, DamageType.LONG_RANGE};
    private final static int INTIMIDATION = 19;
    private final static int DRAGON_HEALTH = 250;

    public RedDragon() {
        super(DRAGON_HEALTH, damageTypes);
    }

    @Override
    public int getDamageAmount() {
        int damageAmount;
        if (DiceRoll.roll20() < INTIMIDATION) {
            damageAmount = DiceRoll.roll8() * 5;
        } else {
            damageAmount = DiceRoll.roll8() * 2;
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
        if (hero.hasDamageType(DamageType.MAGIC) == false) {
            super.takeDamage(hero);
            setHealth(DRAGON_HEALTH);
            System.out.println(this.toString() + " get HP " + this.getHealth());
        }
            if (isAlive()) {
            attack(hero);
        } else {
            System.out.println(this.toString() + " killed by " + hero.toString());
        }
    }

    @Override
    public String toString() {
        return "DRAgOn";
    }

}
