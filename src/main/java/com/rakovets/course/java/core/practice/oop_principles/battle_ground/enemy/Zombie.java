package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
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
        //TODO random 6
        return 6;
    }

    @Override
    public void attack(Fighter fighter) {
        System.out.println(this.toString() + " attaks " + fighter.toString());
        fighter.takeDamage(this);
    }

    @Override
    public void takeDamage(Fighter fighter) {
        super.takeDamage(fighter);
        countHit();
        if (Arrays.binarySearch(damageTypes, DamageType.LONG_RANGE) != -1 &&
                getCount() <= 2) {
            fighter.attack(this);
            return;
        }
        if (isAlive()) {
            attack(fighter);
        } else if ((int) (Math.random() * 100) >= 50) {
            System.out.println("it's alive...again");
            setHealth(10);
            attack(fighter);
        } else {
            System.out.println(this.toString() + " killed by " + fighter.toString());
        }
    }

    @Override
    public String toString() {
        return "zzzzombie";
    }
}
