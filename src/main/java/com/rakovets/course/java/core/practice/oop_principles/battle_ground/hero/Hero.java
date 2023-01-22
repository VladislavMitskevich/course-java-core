package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero;


import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mortal;

public abstract class Hero extends Fighter {
    private String name;


    public Hero(String name, DamageType[] damageTypes, int health) {
        super(damageTypes, health);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
