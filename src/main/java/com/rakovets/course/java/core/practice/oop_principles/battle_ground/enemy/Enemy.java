package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mortal;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Hero;

public abstract class Enemy extends Fighter {

    public Enemy(int health, DamageType[] damageTypes) {
        super(damageTypes, health);
    }

}
