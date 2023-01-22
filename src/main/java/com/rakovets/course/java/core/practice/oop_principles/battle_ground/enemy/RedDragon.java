package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

public class RedDragon extends Enemy{
    private final static DamageType[] damageTypes = {DamageType.MAGIC, DamageType.LONG_RANGE};
    public RedDragon(int health) {
        super(health, damageTypes);
    }

    @Override
    public int getDamageAmount() {
        return 0;
    }

    @Override
    public void attack(Fighter fighter) {

    }
}
