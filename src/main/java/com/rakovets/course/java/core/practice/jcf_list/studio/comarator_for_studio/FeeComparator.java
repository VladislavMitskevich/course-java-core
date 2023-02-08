package com.rakovets.course.java.core.practice.jcf_list.studio.comarator_for_studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class FeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o2.getFee() - o1.getFee();
    }
}
