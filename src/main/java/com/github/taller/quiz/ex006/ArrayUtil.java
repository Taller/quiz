package com.github.taller.quiz.ex006;

import java.util.*;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 04.05.15
 * <p/>
 * Print the elements of an array in the decreasing frequency
 * if 2 numbers have same frequency then print the one which came 1st
 * E.g. 2 5 2 8 5 6 8 8 output: 8 8 8 2 2 5 5 6. without using hashing
 * https://www.linkedin.com/grp/post/3983267-5980278996171046916
 */
public class ArrayUtil {
    public int[] sortArrayWithHashMaps(int[] arr) {
        class ArrEl {
            int value;
            int freq;
            int first;

            @Override
            public boolean equals(Object o) {
                return this == o
                        || o instanceof ArrEl
                        && value == ((ArrEl) o).value;
            }

            @Override
            public int hashCode() {
                return value;
            }
        }

        class ELComparator implements Comparator<ArrEl> {
            @Override
            public int compare(ArrEl el1, ArrEl el2) {
                if (el1.freq > el2.freq) {
                    return -1;
                } else if (el1.freq < el2.freq) {
                    return 1;
                } else if (el1.freq == el2.freq
                            && el1.first < el2.first) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }


        Map<Integer, ArrEl> els = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            ArrEl el;
            if (els.containsKey(arr[i])) {
                el = els.get(arr[i]);
                el.freq = el.freq + 1;
            } else {
                el = new ArrEl();
                el.first = i;
                el.freq = 1;
                el.value = arr[i];
            }
            els.put(arr[i], el);
        }

        List<ArrEl> list = new ArrayList<>();
        for (Map.Entry<Integer, ArrEl> e : els.entrySet()) {
            list.add(e.getValue());
        }
        Collections.sort(list, new ELComparator());

        int[] quit = new int[arr.length];
        int i = 0;
        for (ArrEl el : list) {
            for (int j = 0; j < el.freq; j++) {
                quit[i] = el.value;
                i++;
            }
        }
        return quit;
    }
}
