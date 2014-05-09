package com.github.taller.quiz.ex001;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 08.05.14
 */
public class SinglyLinkedList<T> {
    private T el;
    private SinglyLinkedList linkTo;

    public SinglyLinkedList(T el) {
        this.el = el;
        this.linkTo = null;
    }

    public void addLink(SinglyLinkedList next) {
        this.linkTo = next;
    }

    public T getElement() {
        return el;
    }

    public SinglyLinkedList next() {
        return this.linkTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof SinglyLinkedList)) {
            return false;
        }

        SinglyLinkedList that = (SinglyLinkedList) o;

        if (this.linkTo == null || that.linkTo == null) {
            return false;
        }

        return this.linkTo.equals(that.linkTo);

    }

    @Override
    public int hashCode() {
        return linkTo.hashCode();
    }

}
