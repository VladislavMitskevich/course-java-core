package com.rakovets.course.java.core.practice.jcf_list.studio;

public class Actor implements Comparable<Actor> {
    private String firstName;
    private String lastName;
    private Integer fee;
    private Integer age;


    public Actor(String firstName, String lastName, Integer fee, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getFee() {
        return fee;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Actor o) {
        return this.lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fee=" + fee +
                ", age=" + age +
                '}';
    }

}
