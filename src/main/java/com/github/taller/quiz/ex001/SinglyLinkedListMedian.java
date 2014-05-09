package com.github.taller.quiz.ex001;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 08.05.14
 * <p/>
 * How to get the center element in a Singly Linked list
 */
public class SinglyLinkedListMedian {
    private SinglyLinkedList listHolder;

    public SinglyLinkedListMedian() {
    }

    public SinglyLinkedListMedian(SinglyLinkedList list) {
        this.listHolder = list;
    }

    public void setListHolder(SinglyLinkedList listHolder) {
        this.listHolder = listHolder;
    }

    public Object getMedianElement() {
        if (listHolder == null) {
            System.out.println("Provided list is null.");
            return null;
        }

        if (listHolder.next() == null
                && listHolder.getElement() == null) {
            System.out.println("Provided list is empty.");
            return null;
        }

        if (listHolder.next() == null) {
            return listHolder.getElement();
        }

        SinglyLinkedList median = listHolder;
        SinglyLinkedList iterator = listHolder.next();
        boolean odd = true;

        while (iterator.next() != null) {
            if (odd) {
                iterator = iterator.next();
            } else {
                iterator = iterator.next();
                median = median.next();
            }
            odd = !odd;
        }

        return median.getElement();
    }
}
