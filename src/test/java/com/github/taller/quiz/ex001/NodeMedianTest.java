package com.github.taller.quiz.ex001;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Author: Ivan A. Ivanchikov (taller@github.com)
 * Date: 08.05.14
 */
public class NodeMedianTest {

    protected NodeMedian median;

    @Before
    public void setUp() {
        median = new NodeMedian();
    }

    @Test
    public void nullListProvided() {
        median.setListHolder(null);
        assertEquals("Expected null ", null, median.getMedianElement());
    }

    @Test
    public void emptyListProvided() {
        median.setListHolder(new Node<>(new ListElement(1)));
        assertEquals("Expected null ", new ListElement(1), median.getMedianElement());
    }

    @Test
    public void oneElementListProvided() {
        Node<ListElement> list = new Node<>(new ListElement(1));

        median.setListHolder(list);
        assertEquals("Expected equals id = {1} ", new ListElement(1), median.getMedianElement());
    }

    @Test
    public void twoElementListProvided() {
        Node<ListElement> first = new Node<>(new ListElement(1));
        Node<ListElement> second = new Node<>(new ListElement(2));

        first.addLink(second);
        median.setListHolder(first);

        assertEquals("Expected equals id = {1} ", new ListElement(1), median.getMedianElement());
    }

    @Test
    public void randomElementListProvided() {
        Random r = new Random();
        int size = r.nextInt(90) + 10;
        Node<ListElement> list = generateList(size);

        median.setListHolder(list);

        assertEquals("Expected equals id = " + size / 2, new ListElement(size / 2), median.getMedianElement());
    }

    @Test
    public void threeTo1000ElementListProvided() {
        for (int size = 3; size < 100; size++) {
            Node<ListElement> list = generateList(size);
            median.setListHolder(list);

            assertEquals("Expected equals id = " + size / 2, new ListElement(size / 2), median.getMedianElement());
        }
    }

    protected Node<ListElement> generateList(int size) {

        Node<ListElement> aList = new Node<>(new ListElement(1));
        Node<ListElement> first = aList;

        for (int i = 2; i <= size; i++) {
            Node<ListElement> tList = new Node<>(new ListElement(i));
            aList.addLink(tList);
            aList = tList;
        }

        return first;
    }

    class ListElement {
        private int id;

        ListElement(int id) {
            this.id = id;
        }

        int getId() {
            return id;
        }

        void setId(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (!(o instanceof ListElement)) {
                return false;
            }

            ListElement that = (ListElement) o;

            return id == that.id;

        }

        @Override
        public int hashCode() {
            return id;
        }
    }
}
