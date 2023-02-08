package com.rakovets.course.java.core.practice.jcf_list.student_class.comarator_students;

import com.rakovets.course.java.core.practice.jcf_list.student_class.Person;

import java.util.Comparator;

public class AverageAnnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o2.getAverageAnnualMark(), o1.getAverageAnnualMark());
    }
}
