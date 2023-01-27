package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class TaskForNullPoiterTest {
    TaskForNullPoiter taskForNullPoiter = new TaskForNullPoiter();

    @DisplayName("Test of indexOutOf, throws NullPointerException")
    @Test
    void indexOut() {
        Executable executable = () -> taskForNullPoiter.lengthOfString();

        Assertions.assertThrows(NullPointerException.class, executable);
    }
}
