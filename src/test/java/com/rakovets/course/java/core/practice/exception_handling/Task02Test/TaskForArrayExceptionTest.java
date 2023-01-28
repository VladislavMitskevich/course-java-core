package com.rakovets.course.java.core.practice.exception_handling.Task02Test;

import com.rakovets.course.java.core.practice.exception_handling.Task02.TaskForArrayException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class TaskForArrayExceptionTest {
    TaskForArrayException arrayIndexOutOfBounds = new TaskForArrayException();

    @DisplayName("Test of IndexOutOfBoundsException, throws Exception")
    @Test
    void indexOutOfTest() {
        Executable executable = () -> arrayIndexOutOfBounds.badArray();

        Assertions.assertThrows(IndexOutOfBoundsException.class, executable);
    }
}
