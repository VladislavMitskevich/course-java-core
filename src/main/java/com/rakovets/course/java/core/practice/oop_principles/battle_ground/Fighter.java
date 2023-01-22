package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Fighter implements Attacable, Mortal {
    protected DamageType[] damageTypes;
    private int count;
    private int health;

    public Fighter(DamageType[] damageTypes, int health) {
        this.damageTypes = damageTypes;
        this.health = health;
    }

    public abstract int getDamageAmount();

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attack(Fighter fighter);


    public void takeDamage(Fighter fighter) {
        int damageAmount = fighter.getDamageAmount();
        System.out.println(fighter.toString() + " caused " + damageAmount + " damage points to " + this.toString());
        health -= damageAmount;
        System.out.println(this.toString() + " has " + health + "HP");
    }

    public DamageType[] getDamageTypes() {
        return damageTypes;
    }

    @Override
    public boolean isAlive() {
        return health >= 0;
    }

    @Override
    public void countHit() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
