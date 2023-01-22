package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

import java.util.Arrays;

public class Golem extends Enemy {
    private final static DamageType[] damageTypes = {DamageType.PHYSICAL, DamageType.MELEE};

    public Golem(int health) {
        super(health, damageTypes);
    }


    @Override
    public int getDamageAmount() {
        return 0;
    }

    @Override
    public void attack(Fighter fighter) {

    }

    @Override
    public void takeDamage(Fighter hero) {
        DamageType[] damageTypes = hero.getDamageTypes();
        if (Arrays.binarySearch(damageTypes, DamageType.MAGIC) != -1) {
            super.takeDamage(hero);
        }
        countHit();
        if (Arrays.binarySearch(damageTypes, DamageType.LONG_RANGE) != -1 &&
        getCount() <= 2) {
            return;
        }
        attack(hero);
    }
}
