package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.RedDragon;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Zombie;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero.Archer;

public class Demonstration {
    public static void main(String[] args) {
        Archer archer = new Archer("Legolas");
        Zombie zombie = new Zombie();
        RedDragon rd = new RedDragon();
        archer.attack(zombie);

    }
}
