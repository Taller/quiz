package com.github.taller.quiz.ex003;

import java.util.StringTokenizer;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 25.05.14
 *
 * Performance wise which one is better StringTokenizer or String.split()
 */
public class ArrayUtil {

    public void runTokenizer(String str, String delim) throws InterruptedException {
        StringTokenizer st = new StringTokenizer(str, delim);

        while (st.hasMoreElements()) {
            String s = st.nextToken();
            System.out.println(s);
//            Thread.sleep(1);
        }
    }

    public void runSplit(String str, String delim) throws InterruptedException {
        String stArray[] = str.split(delim);

        for(String s : stArray) {
//            Thread.sleep(1);
//            String ss = s;
            System.out.println(s);
        }
    }

}
