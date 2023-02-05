package com.rakovets.course.java.core.practice.jcf_list.student_class;

import com.rakovets.course.java.core.practice.jcf_list.student_class.comarator_students.AverageAnnualMarkComparator;

import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        students.sort(new AverageAnnualMarkComparator());
        return students.get(0);
    }

    public List<Person> getStudents() {
        return students;
    }
}
