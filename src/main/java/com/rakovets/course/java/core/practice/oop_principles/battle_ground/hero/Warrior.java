package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

public class Warrior extends Hero {
    private final static DamageType[] damageTypes = {DamageType.PHYSICAL, DamageType.MELEE};



    public Warrior(String name) {
        super(name, damageTypes, 400);
    }

    @Override
    public int getDamageAmount() {
        return 0;
    }

    @Override
    public void attack(Fighter fighter) {

    }
}
