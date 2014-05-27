package com.github.taller.quiz.ex002;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 09.05.14
 */
public class ArrayUtilTest {

    /*
            Test plan
            1. int[ ] numbers = {1, 3, 5, 0, 6, 9};
            2. int[ ] numbers2 = {0, 3, 7, 1, 12, 9};

            OUTPUT:
                    1. 6
                    2. 9
    */
    protected ArrayUtil util;

    @Before
    public void setUp() {
        util = new ArrayUtil();
    }

    @Test
    public void firstCase() {
        int[] array = new int[]{1, 3, 5, 0, 6, 9};
        assertEquals("Second highest ", 6, array[util.getIndexOfSecondHighest(array)]);
    }

    @Test
    public void secondCase() {
        int[] array = new int[]{0, 3, 7, 1, 12, 9};
        assertEquals("Second highest ", 9, array[util.getIndexOfSecondHighest(array)]);
    }
}
