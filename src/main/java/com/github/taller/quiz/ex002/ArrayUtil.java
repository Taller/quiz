package com.github.taller.quiz.ex002;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 09.05.14
 */
public class ArrayUtil {

    public int getIndexOfSecondHighest(int[] array) {
        int firstHighest = 0;
        int secondHighest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[firstHighest]
                    && array[i] > array[secondHighest]) {
                secondHighest = firstHighest;
                firstHighest = i;
            } else if (array[i] > array[secondHighest]) {
                secondHighest = i;
            }
        }

        return secondHighest;
    }
}
