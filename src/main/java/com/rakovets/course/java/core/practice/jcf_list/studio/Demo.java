package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comarator_for_studio.AgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comarator_for_studio.FeeAndLastNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comarator_for_studio.FeeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comarator_for_studio.LastNameAndAgeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Actor> actors = List.of(
                new Actor("Denny", "DeVito", 500, 32),
                new Actor("Ben", "ASmith", 500, 24),
                new Actor("Jeny", "Potter", 75, 14)
        );

        List<Actor> studioOfActors = new ArrayList<>(actors);

        Collections.sort(studioOfActors);
        for (Actor actor : studioOfActors) {
            System.out.println(actor);
        }

        studioOfActors.sort(new AgeComparator());
        for (Actor actor : studioOfActors) {
            System.out.println(actor);
        }

        studioOfActors.sort(new FeeComparator());
        for (Actor actor : studioOfActors) {
            System.out.println(actor);
        }

        studioOfActors.sort(new LastNameAndAgeComparator());
        for (Actor actor : studioOfActors) {
            System.out.println(actor);
        }

        studioOfActors.sort(new FeeAndLastNameComparator());
        for (Actor actor : studioOfActors) {
            System.out.println(actor);
        }
    }
}
