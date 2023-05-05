package ru.job4j.iteration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UsingListIteratorIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Раз", "Два", "Три", "Четыре", "Пять");

        /**
         * Использование ListIterator
         */
        ListIterator<String> lItr = list.listIterator();
        /**
         * hasNext() возвращает true если в списке больше элементов
         */
        while (lItr.hasNext()) {
            System.out.println(lItr.next());
        }

        System.out.println("---------");

        /**
         * Использование Iterator
         */
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
