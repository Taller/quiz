package com.github.taller.quiz.ex007;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 19.04.18
 */
public class SubrangesTest {

    private Subranges subranges;


    @Test
    public void test() {
        List<Integer> list = Arrays.asList(3, -4, -3, -2, -1, 0, 1, 5, -5, 4, 2);
        subranges = new Subranges(list);

        assertEquals("Summ is ", 7, subranges.getSumm());
        assertEquals("Subrange started from ", 5, subranges.getStartIndex());
        assertEquals("Subrange ended on ", 11, subranges.getEndIndex());


    }
}