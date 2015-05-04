package com.github.taller.quiz.ex005;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 01.06.14
 * <p/>
 * Return "true" if you can balance the values inside the array
 */
public class ArrayUtil {


    /**
     * Full scan array.
     * Return first answer from left.
     * @return index of array, after which left and right sum will be equal
     */
    public int splitBalanced(int[] array) {
        if (array == null
                || array.length == 0
                || array.length == 1) {
            return -1;
        }

        int length = array.length;
        long leftSum = 0;
        long rightSum = 0;

        int quit = -1;
        for (int i = 1; i < length; i++) {
            for (int li = 0; li < i; li++) {
                leftSum += array[li];
            }
            for (int ri = i; ri < length; ri++) {
                rightSum += array[ri];
            }
            if (leftSum == rightSum) {
                quit = i;
                break;
            } else {
                leftSum = 0;
                rightSum = 0;
            }
        }

        return quit;
    }

}
