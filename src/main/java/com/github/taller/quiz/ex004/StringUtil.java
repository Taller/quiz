package com.github.taller.quiz.ex004;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 27.05.14
 * <p/>
 * Get the SUM of numbers inside the String (ignore other characters)
 */
public class StringUtil {
    public int parseByNumbers(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int total = 0;
        int strLen = str.length();

        StringBuilder tmpStr = new StringBuilder();

        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                tmpStr.append(ch);
            } else if (tmpStr.length() > 0) {
                total = total + Integer.parseInt(tmpStr.toString());
                tmpStr = new StringBuilder();
            }
        }

        if (tmpStr.length() > 0) {
            total = total + Integer.parseInt(tmpStr.toString());
        }

        return total;
    }

    public int parseWithRegExp(String str) {
        Matcher m = Pattern.compile("\\d+").matcher(str);

        int total = 0;

        while(m.find()) {
            total = total + Integer.parseInt(m.group());
        }

        return total;
    }
}
