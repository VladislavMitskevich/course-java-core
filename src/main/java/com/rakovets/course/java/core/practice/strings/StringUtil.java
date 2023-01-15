package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public static void main(String[] args) {
        String str3 = "he";
        String str4 = "ll";
        String str5 = stringGluing(str3, str4);
        System.out.println(str5);
    }
    static String stringGluing(String str1, String str2) {
        String str11 = str1 != null ? (str1) : ("");
        String str22 = str2 != null ? (str2) : ("");
        return str11.concat(str22);
    }
}
