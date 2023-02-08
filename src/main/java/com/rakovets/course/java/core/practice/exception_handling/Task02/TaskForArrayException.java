package com.rakovets.course.java.core.practice.exception_handling.Task02;

public class TaskForArrayException {
    public String badArray() {
        String[] country = {"Barselona", "Madrid", "Valencia"};
        StringBuilder stringNames = new StringBuilder();
        for (int i = 0; i <= country.length; i++) {
            stringNames.append(country[i]);
        }
        return String.valueOf(stringNames);
    }
}
