package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class DiceRoll {
    public static int roll6(){
        return (int) (Math.random()*6 +1);
    }
    public static int roll8(){
        return (int) (Math.random()*7 +1);
    }
    public static int roll10(){
        return (int) (Math.random()*9 +1);
    }
    public static int roll12(){
        return (int) (Math.random()*11 +1);
    }
    public static int roll20(){
        return (int) (Math.random()*19 +1);
    }
    public static int roll100(){
        return (int) (Math.random()*99 +1);
    }
}
