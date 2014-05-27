package com.github.taller.quiz.ex004;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 27.05.14
 */
public class StringUtilTest {

    /*
        Test plan
        1. String alphaNumeric = "abc123xyz"; // 123
        2. String alphaNumeric = "aa11b33";   // 11 + 33 = 44
        3. String alphaNumeric = "7 11 ";      // 7 + 11 = 18; take note there's a space between 7 and 11.

    */
    protected StringUtil util;

    @Before
    public void setUp() {
        util = new StringUtil();
    }

    @Test
    public void firstCase() {
        String alphaNumeric = "abc123xyz";
        assertEquals("Answer ", 123, util.parseByNumbers(alphaNumeric));
    }

    @Test
    public void secondCase() {
        String alphaNumeric = "aa11b33";
        assertEquals("Answer ", 44, util.parseByNumbers(alphaNumeric));
    }

    @Test
    public void thirdCase() {
        String alphaNumeric = "7 11 ";
        assertEquals("Answer ", 18, util.parseByNumbers(alphaNumeric));
    }
}
