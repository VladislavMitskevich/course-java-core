package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

public class Mag extends Hero {
    private final static DamageType[] damageTypes = {DamageType.MAGIC, DamageType.LONG_RANGE};




    public Mag(String name) {
        super(name, damageTypes, 200);
    }

    @Override
    public int getDamageAmount() {
        return 0;
    }

    @Override
    public void attack(Fighter fighter) {

    }
}
