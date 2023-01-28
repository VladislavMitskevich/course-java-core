package com.rakovets.course.java.core.practice.exception_handling.Task03Test;

import com.rakovets.course.java.core.practice.exception_handling.Task03.CheckException;
import com.rakovets.course.java.core.practice.exception_handling.Task03.CustomException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class CheckExceptionTest {
    CheckException checkException = new CheckException();
    @DisplayName("Test of CustomException, throws Exception")
    @Test
    void checkExceptionTest(){
        Executable executable = () -> checkException.onePeace("Namy");

        Assertions.assertThrows(CustomException.class, executable);
    }
}
