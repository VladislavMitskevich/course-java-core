package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringUtilTest {
    static StringUtil stringUtil;

    @BeforeAll
    static void init() {
        stringUtil = new StringUtil();
    }

    @Test
    void stringGluingTest01() {
        String abx = stringUtil.stringGluing("abc", "cba");

        Assertions.assertEquals("abccba", abx);
    }

    @Test
    void stringGluingTest02() {
        String abx = stringUtil.stringGluing("abc", null);

        Assertions.assertEquals("abc", abx);
    }

    @Test
    void stringGluingTest03() {
        String abx = stringUtil.stringGluing(null, "cba");

        Assertions.assertEquals("cba", abx);
    }

    @Test
    void stringGluingTest04() {
        String abx = stringUtil.stringGluing(null, null);

        Assertions.assertEquals("", abx);
    }

    @Test
    void indexOfCharTest01() {
        int[] abx = stringUtil.indexesOfChar(null, '\u0000');

        Assertions.assertArrayEquals(new int[]{}, abx);
    }

    @Test
    void indexOfCharTest02() {
        int[] abx = stringUtil.indexesOfChar(null, '$');

        Assertions.assertArrayEquals(new int[]{}, abx);
    }

    @Test
    void indexOfCharTest03() {
        int[] abx = stringUtil.indexesOfChar("hello", '\u0000');

        Assertions.assertArrayEquals(new int[]{}, abx);
    }

    @Test
    void indexOfCharTest04() {
        int[] abx = stringUtil.indexesOfChar("hello world", 'l');

        Assertions.assertArrayEquals(new int[]{2, 3, 9}, abx);
    }

    @Test
    void indexOfCharTest05() {
        int[] abx = stringUtil.indexesOfChar(" llllll ", 'l');

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, abx);
    }

    @Test
    void compareTwoStringTest01() {
        boolean abx = stringUtil.compareTwoStrings(null, null);

        Assertions.assertEquals(true, abx);
    }

    @Test
    void compareTwoStringTest02() {
        boolean abx = stringUtil.compareTwoStrings(null, "hello");

        Assertions.assertEquals(false, abx);
    }

    @Test
    void compareTwoStringTest03() {
        boolean abx = stringUtil.compareTwoStrings("null", null);

        Assertions.assertEquals(false, abx);
    }

    @Test
    void compareTwoStringTest04() {
        boolean abx = stringUtil.compareTwoStrings("null", "null");

        Assertions.assertEquals(true, abx);
    }

    @Test
    void trimAndLowerCaseTest01() {
        String string = stringUtil.trimAndLowerCase(null);

        Assertions.assertEquals("", string);
    }

    @Test
    void trimAndLowerCaseTest02() {
        String string = stringUtil.trimAndLowerCase("");

        Assertions.assertEquals("", string);
    }

    @Test
    void trimAndLowerCaseTest03() {
        String string = stringUtil.trimAndLowerCase(" ABcdFG ");

        Assertions.assertEquals("abcdfg", string);
    }

    @Test
    void trimAndLowerCaseTest04() {
        String string = stringUtil.trimAndLowerCase("ABCDFG");

        Assertions.assertEquals("abcdfg", string);
    }

    @Test
    void notificationOfASubstringTest01() {
        String string = stringUtil.notificationOfASubstring(null, '@', '$');

        Assertions.assertEquals("your string equls null", string);
    }

    @Test
    void notificationOfASubstringTest02() {
        String string = stringUtil.notificationOfASubstring("your string equls null", '3', '$');

        Assertions.assertEquals("your char is wrong", string);
    }

    @Test
    void notificationOfASubstringTest03() {
        String string = stringUtil.notificationOfASubstring("your string equls null", 'r', 'y');

        Assertions.assertEquals("your char is wrong", string);
    }

    @Test
    void notificationOfASubstringTest04() {
        String string = stringUtil.notificationOfASubstring("your string equls null", 'e', 'a');

        Assertions.assertEquals("quls null", string);
    }

    @Test
    void notificationOfASubstringTest05() {
        String string = stringUtil.notificationOfASubstring("your string equls null", 'y', 'u');

        Assertions.assertEquals("yo", string);
    }

    @Test
    void smileEmojiTest01() {
        String string = stringUtil.smileEmoji(null);

        Assertions.assertEquals("your string equls null", string);
    }

    @Test
    void smileEmojiTest02() {
        String string = stringUtil.smileEmoji("Get some smile :)");

        Assertions.assertEquals("Get some smile :)", string);
    }

    @Test
    void smileEmojiTest03() {
        String string = stringUtil.smileEmoji("Get some smile :(");

        Assertions.assertEquals("Get some smile :)", string);
    }

    @Test
    void startAndEndTextTest01() {
        boolean isTrue = stringUtil.startAndEndText("", null);

        Assertions.assertEquals(false, isTrue);
    }

    @Test
    void startAndEndTextTest02() {
        boolean isTrue = stringUtil.startAndEndText(null, "");

        Assertions.assertEquals(false, isTrue);
    }

    @Test
    void startAndEndTextTest03() {
        boolean isTrue = stringUtil.startAndEndText("", "");

        Assertions.assertEquals(true, isTrue);
    }

    @Test
    void startAndEndTextTest04() {
        boolean isTrue = stringUtil.startAndEndText("abc fgb hello", "abc");

        Assertions.assertEquals(false, isTrue);
    }

    @Test
    void startAndEndTextTest05() {
        boolean isTrue = stringUtil.startAndEndText("abc fgb hello abc", "abc");

        Assertions.assertEquals(true, isTrue);
    }

    @Test
    void startAndEndTextTest06() {
        boolean isTrue = stringUtil.startAndEndText("abcfgb hello abc", "abc ");

        Assertions.assertEquals(false, isTrue);
    }

    @Test
    void numberOfVowelLettersTest01() {
        int actual = stringUtil.numberOfVowelLetters("hello world");

        Assertions.assertEquals(3, actual);
    }

    @Test
    void numberOfVowelLettersTest02() {
        int actual = stringUtil.numberOfVowelLetters(null);

        Assertions.assertEquals(0, actual);
    }

    @Test
    void numberOfVowelLettersTest03() {
        int actual = stringUtil.numberOfVowelLetters("aeyuio");

        Assertions.assertEquals(6, actual);
    }

    @Test
    void numberOfPunctuationMarksTest01() {
        int number = stringUtil.numberOfPunctuationMarks(null);

        Assertions.assertEquals(0,number);
    }

    @Test
    void numberOfPunctuationMarksTest02() {
        int number = stringUtil.numberOfPunctuationMarks("null");

        Assertions.assertEquals(0,number);
    }

    @Test
    void numberOfPunctuationMarksTest03() {
        int number = stringUtil.numberOfPunctuationMarks("123, 12312412: 123123;");

        Assertions.assertEquals(3,number);
    }

    @Test
    void isPolindromeTest01() {
        boolean testTrue = stringUtil.isPolindrome(null);

        Assertions.assertEquals(false, testTrue);
    }

    @Test
    void isPolindromeTest02() {
        boolean testTrue = stringUtil.isPolindrome("Do geese see God?");

        Assertions.assertEquals(true, testTrue);
    }

    @Test
    void isPolindromeTest03() {
        boolean testTrue = stringUtil.isPolindrome("191");

        Assertions.assertEquals(true, testTrue);
    }

    @Test
    void stringOfNumbersTest01() {
        String testString = stringUtil.stringOfNumbers(null);

        Assertions.assertEquals(null, testString);
    }

    @Test
    void stringOfNumbersTest02() {
        String testString = stringUtil.stringOfNumbers("hello worlds");

        Assertions.assertEquals("", testString);
    }

    @Test
    void stringOfNumbersTest03() {
        String testString = stringUtil.stringOfNumbers("we have 13$ to buy something near coast 13");

        Assertions.assertEquals("13 13", testString);
    }

    @Test
    void initialsFromStringTest01() {
        String stringTest = stringUtil.initialsFromString(null);

        Assertions.assertEquals(null, stringTest);
    }

    @Test
    void initialsFromStringTest02() {
        String stringTest = stringUtil.initialsFromString("Anton Antonov");

        Assertions.assertEquals("A.A.;", stringTest);
    }

    @Test
    void initialsFromStringTest03() {
        String stringTest = stringUtil.initialsFromString("Anton Antonov, Ivan Ivov");

        Assertions.assertEquals("A.A.; I.I.;", stringTest);
    }

    @Test
    void initialsFromStringTest04() {
        String stringTest = stringUtil.initialsFromString("Anton");

        Assertions.assertEquals("A.", stringTest);
    }

    @Test
    void countWordsInStringTest01(){
        int numberTest = stringUtil.countWordsInString(null);

        Assertions.assertEquals(0, numberTest);
    }

    @Test
    void countWordsInStringTest02(){
        int numberTest = stringUtil.countWordsInString("hell");

        Assertions.assertEquals(1, numberTest);
    }

    @Test
    void countWordsInStringTest03(){
        int numberTest = stringUtil.countWordsInString("hello world ");

        Assertions.assertEquals(2, numberTest);
    }

    @Test
    void parseStringOfLengthTest01() {
        String[] testStringArray = stringUtil.parseStringOfLength(null, 3);

        Assertions.assertArrayEquals(new String[]{}, testStringArray);
    }

    @Test
    void parseStringOfLengthTest02() {
        String[] testStringArray = stringUtil.parseStringOfLength("null", 0);

        Assertions.assertArrayEquals(new String[]{}, testStringArray);
    }

    @Test
    void parseStringOfLengthTest03() {
        String[] testStringArray = stringUtil.parseStringOfLength("hell", 2);

        Assertions.assertArrayEquals(new String[]{"he", "ll"}, testStringArray);
    }

    @Test
    void parseStringOfLengthTest04() {
        String[] testStringArray = stringUtil.parseStringOfLength("null", 3);

        Assertions.assertArrayEquals(new String[]{"nul", "l"}, testStringArray);
    }
}
