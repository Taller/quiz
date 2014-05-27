package com.github.taller.quiz.ex003;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 25.05.14
 */
public class ArrayUtilTest {
    private final static int MAX_ELEMENTS = 500;
    private final static int MAX_ELEMENT_LENGTH = 5;
    private final static int TEST_REPEAT = 3000;
    private final static String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private final static String DELIMITER = ";";

    protected ArrayUtil util;
    protected StringBuilder sb;

    @Before
    public void setUp() {
        util = new ArrayUtil();

        sb = new StringBuilder();
        generateTestString(sb);
    }

    @Test
    public void firstCase() throws InterruptedException {
        long tokenizer = System.currentTimeMillis();

        for  (int i = 0; i < TEST_REPEAT; i++) {
            util.runTokenizer(sb.toString(), DELIMITER);
        }
        tokenizer = System.currentTimeMillis() - tokenizer;

        long split = System.currentTimeMillis();
        for  (int i = 0; i < TEST_REPEAT; i++) {
            util.runSplit(sb.toString(), DELIMITER);
        }
        split = System.currentTimeMillis() - split;

        Thread.sleep(10);
        System.out.println("Tokenizer " + tokenizer);
        System.out.println("Split " + split);

//        assertTrue("Tokenizer is slower ", tokenizer > split);
        assertTrue("Split is slower ", split > tokenizer);
    }

    protected void generateTestString(StringBuilder sb) {
        for (int i = 0; i < MAX_ELEMENTS; i ++ ) {
            sb.append(generateElement());
            if (i < MAX_ELEMENTS - 1) {
                sb.append(DELIMITER);
            }
        }
    }

    protected String generateElement() {
        Random len = new Random();
        int lenOfElement = len.nextInt(MAX_ELEMENT_LENGTH);
        int alphabetSize = ALPHABET.length();
        StringBuilder sb = new StringBuilder();
        for( int i = 0; i < lenOfElement; i++) {
            int index = len.nextInt(alphabetSize);
            char ch = ALPHABET.charAt(index);
            sb.append(ch);
        }

        return sb.toString();
    }
}
