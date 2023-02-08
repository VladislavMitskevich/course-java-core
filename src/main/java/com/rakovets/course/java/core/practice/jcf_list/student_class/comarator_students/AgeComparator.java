package com.rakovets.course.java.core.practice.jcf_list.student_class.comarator_students;

import com.rakovets.course.java.core.practice.jcf_list.student_class.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
