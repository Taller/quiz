package com.github.taller.quiz.ex004;


/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 27.05.14
 * <p/>
 * Get the SUM of numbers inside the String (ignore other characters)
 */
public class StringUtil {
    public final static String ALPHABET_DIGITS = "0123456789";

    public int parseByNumbers(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int total = 0;
        int strLen = str.length();

        StringBuilder tmpStr = new StringBuilder();

        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);
            if (ALPHABET_DIGITS.indexOf(ch) != -1) {
                tmpStr.append(ch);
            } else if (tmpStr.length() != 0) {
                total = total + Integer.parseInt(tmpStr.toString());
                tmpStr = new StringBuilder();
            }
        }

        if (tmpStr.length() != 0) {
            total = total + Integer.parseInt(tmpStr.toString());
        }

        return total;
    }
}
