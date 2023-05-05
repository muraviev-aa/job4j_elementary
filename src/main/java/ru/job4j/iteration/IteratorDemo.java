package ru.job4j.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Раз");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        list.add("Пять");

        System.out.print("Исходный список: ");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.print("Измененный список: ");
        ListIterator litr = list.listIterator();
        while (litr.hasNext()) {
            litr.set(litr.next() + "+");
        }
        itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.print("Измененный список задом наперед: ");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
    }
}
