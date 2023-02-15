package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DiceRoll;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

import java.util.Arrays;

public class Golem extends Enemy {
    private final static DamageType[] damageTypes = {DamageType.PHYSICAL, DamageType.MELEE};
    private final static int GOLEM_HEALTH = 220;

    public Golem() {
        super(GOLEM_HEALTH, damageTypes);
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
        countHit();
        if (hero.hasDamageType(DamageType.LONG_RANGE) == true &&
                getCount() <= 2) {
            hero.attack(this);
            return;
        }
        if (this.getHealth() <= 20) {
            int currentHp = getHealth();
            int upHp = currentHp +5;
            setHealth(upHp);
            System.out.println(this.toString() + " return his HP to" + this.getHealth());
        }
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
