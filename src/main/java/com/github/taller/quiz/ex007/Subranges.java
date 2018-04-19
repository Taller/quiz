package com.github.taller.quiz.ex007;

import java.util.List;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 19.04.18
 * <p>
 * Find subrange in int array which has the highest sum.
 */
public class Subranges {

    private List<Integer> list;

    private int startIndex;

    private int endIndex;

    private int summ;

    public Subranges(List<Integer> list) {
        this.list = list;

        findSubrange();
    }

    private void findSubrange() {
        summ = Integer.MIN_VALUE;

        for (int i = 0; i < list.size() + 1; i++) {
            for (int j = 0; j < i; j++) {
                List<Integer> subList = list.subList(j, i);
                int summTmp = subList.stream().mapToInt(Integer::intValue).sum();
                if (summ < summTmp) {
                    summ = summTmp;
                    startIndex = j;
                    endIndex = i;
                }
            }

        }
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public int getSumm() {
        return summ;
    }
}
