package com.github.taller.quiz.ex006;

import org.junit.Before;
import org.junit.Test;


import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 04.05.15
 */
public class ArrayUtilTest {
    protected ArrayUtil util;

    @Before
    public void setUp() {
        util = new ArrayUtil();
    }

    @Test
    public void firstCase() {
        int[] numbers = {2, 5, 2, 8, 5, 6, 8, 8};
        int[] answer = {8, 8, 8, 2, 2, 5, 5, 6};
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(util.sortArrayWithHashMaps(numbers)));

        assertArrayEquals("Arrays equal", answer, util.sortArrayWithHashMaps(numbers));
    }

    @Test
    public void secondCase() {
        int[] numbers = {2,5,2,8,5,8,8,1,1,1,1,3,3,3,2};
        int[] answer = {1,1,1,1,2,2,2,3,3,3,8,8,8,5,5};
        int[] myAnswer = {1,1,1,1,2,2,2,8,8,8,3,3,3,5,5};
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(myAnswer));
        System.out.println(Arrays.toString(util.sortArrayWithHashMaps(numbers)));

        assertArrayEquals("Arrays equal", myAnswer, util.sortArrayWithHashMaps(numbers));
    }



}
