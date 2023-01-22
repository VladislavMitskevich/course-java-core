package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Zombie;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Archer;

public class Demonstration {
    public static void main(String[] args) {
        Archer archer = new Archer("Toxa");
        Zombie zombie = new Zombie();
        archer.attack(zombie);

    }
}
