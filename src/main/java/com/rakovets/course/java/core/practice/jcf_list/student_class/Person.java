package com.rakovets.course.java.core.practice.jcf_list.student_class;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Double averageAnnualMark;

    public Person(String name, String surname, Integer age, Double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", averageAnnualMark=" + averageAnnualMark +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getAverageAnnualMark() {
        return averageAnnualMark;
    }
}
