package ru.job4j.collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoIteratorDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");

        /**
         * Метод iterator()
         */
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /**
         * Метод descendingIterator()
         */
        Iterator<String> iterator1 = deque.descendingIterator();
        System.out.println();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
