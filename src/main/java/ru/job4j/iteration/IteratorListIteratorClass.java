package ru.job4j.iteration;

import java.util.*;

public class IteratorListIteratorClass {
    public static <T, C> void IterateUsingIterator(List<T> list, Class<C> iteratorClass) {
        if (iteratorClass.getSimpleName().equals("ListIterator")) {
            ListIterator<T> lItr = list.listIterator();
            while (lItr.hasNext()) {
                System.out.println(lItr.next() + " ");
            }
        } else if (iteratorClass.getSimpleName().equals("Iterator")) {
            Iterator<T> itr = list.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next() + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Раз", "Два", "Три", "Четыре", "Пять");
        IterateUsingIterator(list, Iterator.class);
        IterateUsingIterator(list, ListIterator.class);
    }
}
