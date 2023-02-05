package com.rakovets.course.java.core.practice.jcf_list.student_class.comarator_students;

import com.rakovets.course.java.core.practice.jcf_list.student_class.Person;

import java.util.Comparator;

public class FullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        var result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            return o1.getSurname().compareTo(o2.getSurname());
        } else {
            return result;
        }
    }
}
