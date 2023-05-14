package ru.job4j.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueRunner {
    public static void part1() {
        Queue<String> queue = new LinkedList<>();
        /**
         * Метод add()
         */
        queue.add("first");
        queue.add("second");
        queue.add("third");

        System.out.println("До применения метода remove:");
        for (String string : queue) {
            System.out.println(string);
        }

        /**
         * Метод remove() - удаление верхнего элемента из очереди
         */
        queue.remove();
        System.out.println();
        System.out.println("После применения метода remove:");
        for (String string : queue) {
            System.out.println(string);
        }

        /**
         * Метод poll() возвращает null, когда очередь пуста
         */
        Queue<String> queue1 = new LinkedList<>();
        System.out.println();
        System.out.println("После применения метода poll:");
        System.out.println(queue1.poll());
    }

    public static void part2() {
        Queue<String> queue1 = new LinkedList<>();
        /**
         * Метод peek() - возвращает null, когда очередь пуста.
         * Возвращает первый элемент из очереди, без его удаления.
         */
        System.out.println();
        System.out.println("После применения метода peek:");
        System.out.println(queue1.peek());

        Queue<String> queue2 = new ArrayBlockingQueue<>(3);
        queue2.offer("first");
        queue2.offer("second");
        queue2.offer("third");
        queue2.offer("fourth");
        /**
         * Метод element() возвращает элемент из очереди без его удаления
         */
        System.out.println();
        System.out.println("После применения метода element:");
        System.out.println(queue2.element());

        /**
         * Метод offer() - попытка вставить элемент в конец очереди
         */
        System.out.println();
        System.out.println("После применения метода offer. Нет добавления 4-го элемента.");
        for (String string : queue2) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        part1();
        part2();
    }
}
