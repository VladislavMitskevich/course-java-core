package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DamageType;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.DiceRoll;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Fighter;

public class Warrior extends Hero {
    private final static DamageType[] damageTypes = {DamageType.PHYSICAL, DamageType.MELEE};
    private final static int ARMOR_CLASS = 21;
    private final static int WARRIOR_HEALTH = 320;


    public Warrior(String name) {
        super(name, damageTypes, WARRIOR_HEALTH);
    }

    @Override
    public void attack(Fighter enemy) {
        System.out.println(this.toString() + " attaks " + enemy.toString());
        enemy.takeDamage(this);
    }

    @Override
    public void takeDamage(Fighter enemy) {
        int enemyAttack = DiceRoll.roll20()+5;
        if (enemyAttack >= ARMOR_CLASS) {
            super.takeDamage(enemy);
        } else {
            System.out.println(this.getName() +" blocked attack");
        }
        if (isAlive()) {
            attack(enemy);
        } else {
            System.out.println(enemy + " killed archer" + this.getName());
        }
    }

    @Override
    public int getDamageAmount() {
        countHit();
        int damageAmount;
        if (getCount() % 3 == 0) {
            damageAmount = DiceRoll.roll10() * 3;
            System.out.println(this.getName() + " has power attack");
        } else {
            damageAmount = DiceRoll.roll10();
            System.out.println("Attack");
        }
        return damageAmount;
    }

    @Override
    public String toString() {
        return getName();
    }
}
