package com.rakovets.course.java.core.practice.exception_handling.Task03;

public class CheckException {
    public void onePeace(String name) throws CustomException {
        String person = "Luffy, Zorro, Sanji";
        if (!person.contains(name)) {
            throw new CustomException("This isn't monster trio");
        }
    }
}
