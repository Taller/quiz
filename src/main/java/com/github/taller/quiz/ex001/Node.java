package com.github.taller.quiz.ex001;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 08.05.14
 */
public class Node<T> {
    private T el;
    private Node linkTo;

    public Node(T el) {
        this.el = el;
        this.linkTo = null;
    }

    public void addLink(Node next) {
        this.linkTo = next;
    }

    public T getElement() {
        return el;
    }

    public Node next() {
        return this.linkTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Node)) {
            return false;
        }

        Node that = (Node) o;

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
