package com.github.taller.quiz.ex005;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 25.05.14
 */
public class ArrayUtilTest {
  /*
        1. int[ ] numbers = {1, 1, 1, 2, 1};
        2. int[ ] numbers = {2, 1, 1, 2, 1};
        3. int[ ] numbers = {10,10};
  */

    protected ArrayUtil util;

    @Before
    public void setUp() {
        util = new ArrayUtil();
    }

    @Test
    public void firstCase() {
        int[] numbers = {1, 1, 1, 2, 1};
        assertEquals("Answer = 3", 3, util.splitBalanced(numbers));
    }

    @Test
    public void secondCase() {
        int[] numbers = {2, 1, 1, 2, 1};
        assertEquals("Answer = -1", -1, util.splitBalanced(numbers));
    }

    @Test
    public void thirdCase() {
        int[] numbers = {10,10};
        assertEquals("Answer = 0", 1, util.splitBalanced(numbers));
    }

    @Test
    public void fourthCase() {
        int[] numbers = {1, 1, 1, 1, 1, 1, 6};
        assertEquals("Answer = 6", 6, util.splitBalanced(numbers));
    }

    @Test
    public void fifthCase() {
        int[] numbers = {6, 1, 1, 1, 1, 1, 1};
        assertEquals("Answer = 1", 1, util.splitBalanced(numbers));
    }
}
