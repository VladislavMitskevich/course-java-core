package com.rakovets.course.java.core.practice.jcf_list.student_class;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Person> actors = List.of(
                new Person("Denny", "DeVito", 500, 3.5),
                new Person("Ben", "ASmith", 500, 4.5),
                new Person("Jeny", "Potter", 75, 5.0)
        );

        List<Person> studioOfActors = new ArrayList<>(actors);
        SchoolClass schoolClass = new SchoolClass(studioOfActors);
        schoolClass.getBestStudent(studioOfActors);
        System.out.println(schoolClass.getBestStudent(studioOfActors));
    }
}
