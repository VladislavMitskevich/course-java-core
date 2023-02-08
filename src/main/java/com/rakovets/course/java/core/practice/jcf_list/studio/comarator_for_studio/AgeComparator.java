package com.rakovets.course.java.core.practice.jcf_list.studio.comarator_for_studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class AgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getAge() - o2.getAge();
    }
}
