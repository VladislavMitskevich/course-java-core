package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;

public class StringUtil {
    public static void main(String[] args) {
        String str3 = "he";
        String str4 = "ll";
        String str5 = stringGluing(str3, str4);
        System.out.println(str5);
        int[] arrayMatches = indexesOfChar("hello world", 'a');
        System.out.println(Arrays.toString(arrayMatches));
        boolean compare = compareTwoStrings("abc", null);
        System.out.println(compare);
        System.out.println(trimAndLowerCase("HeLLo "));
        System.out.println(notificationOfASubstring("paragraf", 'a', 'g'));
        System.out.println(smileEmoji("five sdfsdfssgsg"));
        System.out.println(startAndEndText("World hello", "hello"));
        System.out.println(numberOfVowelLetters("Helqel, world"));
        System.out.println(numberOfPunctuationMarks("giveme, a Hell!!!"));
        System.out.println(isPolindrome("Do geese see God?"));
    }

    static String stringGluing(String str1, String str2) {
        String str11 = str1 != null ? (str1) : ("");
        String str22 = str2 != null ? (str2) : ("");
        return str11.concat(str22);
    }

    static private int[] indexesOfChar(String string, char char1) {
        int countChar = string.length() - string.replaceAll(String.valueOf(char1), "").length();
        int[] arrayMatches;
        if (countChar != 0) {
            arrayMatches = new int[countChar];
            int i = -1;
            int j = 0;
            while (true) {
                i = string.indexOf(char1, i + 1);
                if (i < 0) {
                    break;
                }
                arrayMatches[j] = i;
                j++;
            }
        } else {
            arrayMatches = new int[]{-1};
        }
        return arrayMatches;
    }

    static private boolean compareTwoStrings(String str1, String str2) {
        String str11 = str1 != null ? (str1) : ("");
        String str22 = str2 != null ? (str2) : ("");
        return str11.equals(str22);
    }

    static private String trimAndLowerCase(String string) {
        return string.trim().toLowerCase();
    }

    static private String notificationOfASubstring(String string, char char1, char char2) {
        String ouutputString;
        int indexOfChar1 = string.indexOf(char1);
        int indexOfChar2 = string.indexOf(char2);
        if (indexOfChar1 == -1 || indexOfChar2 == -1 && indexOfChar1 > indexOfChar2) {
            ouutputString = "your char is wrong";
        } else {
            ouutputString = string.substring(indexOfChar1, indexOfChar2);
        }
        return ouutputString;
    }

    static private String smileEmoji(String string) {
        String outText;
        if (string.indexOf(":(") == -1) {
            outText = string;
        } else {
            outText = string.replace(":(", ":)");
        }
        return outText;
    }

    static private boolean startAndEndText(String text, String world) {
        return text.toLowerCase().startsWith(world.toLowerCase()) && text.toLowerCase().endsWith(world.toLowerCase());
    }

    static private int numberOfVowelLetters(String string) {
        return string.toLowerCase().length() -
                string.toLowerCase().replaceAll("[aeyuio]", "").length();
    }

    static private int numberOfPunctuationMarks(String string) {
        return string.toLowerCase().length() -
                string.toLowerCase().replaceAll("[.,?!]", "").length();
    }

    static private boolean isPolindrome(String string) {
        String newString = string.toLowerCase().replaceAll("[.,?! ]","");
        String revers = new StringBuilder(newString).reverse().toString();
        return revers.equals(newString);
    }
}
