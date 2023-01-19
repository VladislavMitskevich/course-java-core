package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;

public class StringUtil {
/*    public static void main(String[] args) {
        System.out.println(countWordsInString("John Smith, Gohn lenon; gerber Wells"));
        String[] array = parseStringOfLength("ytchjvjbjhvjhvjvkkvjjchgcl", 5);
        System.out.println(Arrays.toString(array));
    }*/


    public String stringGluing(String str1, String str2) {
        String str11 = str1 != null ? (str1) : ("");
        String str22 = str2 != null ? (str2) : ("");
        return str11.concat(str22);
    }

    public  int[] indexesOfChar(String string, char char1) {
        int[] arrayMatches;
        if (string == null || char1 == '\u0000') {
            arrayMatches = new int[]{};
        } else {
            int countChar = string.length() - string.replaceAll(String.valueOf(char1), "").length();
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
        }
        return arrayMatches;
    }

    public boolean compareTwoStrings(String str1, String str2) {
        String str11 = str1 != null ? (str1) : ("");
        String str22 = str2 != null ? (str2) : ("");
        return str11.equals(str22);
    }

    public String trimAndLowerCase(String string) {
        return string.trim().toLowerCase();
    }

    public String notificationOfASubstring(String string, char char1, char char2) {
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

    public String smileEmoji(String string) {
        String outText;
        if (string.indexOf(":(") == -1) {
            outText = string;
        } else {
            outText = string.replace(":(", ":)");
        }
        return outText;
    }

    public boolean startAndEndText(String text, String world) {
        return text.toLowerCase().startsWith(world.toLowerCase()) && text.toLowerCase().endsWith(world.toLowerCase());
    }

    public int numberOfVowelLetters(String string) {
        return string.toLowerCase().length() -
                string.toLowerCase().replaceAll("[aeyuio]", "").length();
    }

    public int numberOfPunctuationMarks(String string) {
        return string.toLowerCase().length() -
                string.toLowerCase().replaceAll("[.,?!]", "").length();
    }

    public boolean isPolindrome(String string) {
        String newString = string.toLowerCase().replaceAll("[.,?! ]", "");
        String revers = new StringBuilder(newString).reverse().toString();
        return revers.equals(newString);
    }

    public String stringOfNumbers(String string) {
        String stringLongNumbers = string.replaceAll("[^0-9]", " ");
        return stringLongNumbers.trim().replaceAll("\\s{2,}", " ");
    }

    public String initialsFromString(String string) {
        String stringWithoutPunctuation = string.replaceAll("[.,?!;]", " ");
        String[] stringArray = stringWithoutPunctuation.trim().replaceAll("\\s{2,}", " ").split(" ");
        String initials = "";
        for (int count = 0; count < stringArray.length; count++) {
            initials += stringArray[count].substring(0, 1).toUpperCase();
            if ((count + 1) % 2 == 0) {
               initials = initials + ".; ";
            } else {
                initials = initials + ".";
            }
        }
        return initials.trim();
    }

    public int countWordsInString (String string) {
        String[] wordsArray = string.trim().split("\\s+");
        return wordsArray.length;
    }

    public String[] parseStringOfLength (String string, int demention){
        return string.split("(?<=\\G.{" + demention + "})");
    }
}
