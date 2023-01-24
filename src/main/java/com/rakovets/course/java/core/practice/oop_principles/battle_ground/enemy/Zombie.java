package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DiceRoll;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Hero;

import java.util.Arrays;

public class Zombie extends Enemy {
    private final static DamageType[] damageTypes = {DamageType.MELEE, DamageType.PHYSICAL};
    private final static int ZOMBIE_HEALTH = 180;

    public Zombie() {
        super(ZOMBIE_HEALTH, damageTypes);
    }

    @Override
    public int getDamageAmount() {
        return DiceRoll.roll6();
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
        if (isAlive()) {
            attack(hero);
        } else if (DiceRoll.roll100() >= 50) {
            System.out.println("it's alive...again");
            setHealth(10);
            attack(hero);
        } else {
            System.out.println(this.toString() + " killed by " + hero.toString());
        }
    }

    @Override
    public String toString() {
        return "zzzzombie";
    }
}
