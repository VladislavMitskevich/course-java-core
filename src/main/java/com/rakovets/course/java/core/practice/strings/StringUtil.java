package com.rakovets.course.java.core.practice.strings;


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

    public int[] indexesOfChar(String string, char char1) {
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
        return string != null ? (string.trim().toLowerCase()) : ("");
    }

    public String notificationOfASubstring(String string, char char1, char char2) {
        String ouutputString;
        if (string != null) {
            int indexOfChar1 = string.indexOf(char1);
            int indexOfChar2 = string.indexOf(char2);
            if (indexOfChar1 == -1 || indexOfChar1 > indexOfChar2) {
                ouutputString = "your char is wrong";
            } else {
                ouutputString = string.substring(indexOfChar1, indexOfChar2);
            }
        } else {
            ouutputString = "your string equls null";
        }
        return ouutputString;
    }

    public String smileEmoji(String string) {
        String outText;
        if (string == null) {
            outText = "your string equls null";
        } else {
            outText = string.replace(":(", ":)");
        }
        return outText;
    }

    public boolean startAndEndText(String text, String world) {
        boolean outputText;
        if (text == null || world == null) {
            outputText = false;
        } else {
            outputText = text.toLowerCase().startsWith(world.toLowerCase())
                    && text.toLowerCase().endsWith(world.toLowerCase());
        }
        return outputText;
    }

    public int numberOfVowelLetters(String string) {
        int numberIncluds = (string == null) ? 0 : string.toLowerCase().length() -
                string.toLowerCase().replaceAll("[aeyuio]", "").length();
        return numberIncluds;
    }

    public int numberOfPunctuationMarks(String string) {
        int numberIncluds = (string == null) ? 0 : string.toLowerCase().length() -
                string.toLowerCase().replaceAll("[.,?!:;]", "").length();
        return numberIncluds;
    }

    public boolean isPolindrome(String string) {
        boolean isTrue;
        if (string == null) {
            isTrue = false;
        } else {
            String newString = string.toLowerCase().replaceAll("[.,?! ]", "");
            String revers = new StringBuilder(newString).reverse().toString();
            isTrue = revers.equals(newString);
        }
        return isTrue;
    }

    public String stringOfNumbers(String string) {
        String stringOutput;
        if (string == null) {
            stringOutput = null;
        } else {
            stringOutput = string.replaceAll("[^0-9]", " ")
                    .trim().replaceAll("\\s{2,}", " ");

        }
        return stringOutput;
    }

    public String initialsFromString(String string) {
        String stringOutput = null;
        if (string == null) {
            stringOutput = null;
        } else {
            String stringWithoutPunctuation = string.replaceAll("[.,?!;]", " ");
            String[] stringArray = stringWithoutPunctuation.trim().replaceAll("\\s{2,}", " ")
                    .split(" ");
            String initials = "";
            for (int count = 0; count < stringArray.length; count++) {
                initials += stringArray[count].substring(0, 1).toUpperCase();
                if ((count + 1) % 2 == 0) {
                    initials = initials + ".; ";
                } else {
                    initials = initials + ".";
                }
                stringOutput = initials.trim();
            }
        }
        return stringOutput;
    }

    public int countWordsInString(String string) {
        int numberOutput;
        if (string == null) {
            numberOutput = 0;
        } else {
            numberOutput = string.trim().split("\\s+").length;
        }
        return numberOutput;
    }

    public String[] parseStringOfLength(String string, int demention) {
        String[] arrayStrings;
        if (string == null || demention == 0) {
            arrayStrings = new String[]{};
        }else {
            arrayStrings  = string.split("(?<=\\G.{" + demention + "})");
        }
        return arrayStrings;
    }
}
