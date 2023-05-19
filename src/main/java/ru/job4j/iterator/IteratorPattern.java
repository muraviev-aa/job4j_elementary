package ru.job4j.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPattern {
    private static void iterate(ArrayList<String> arl) {
        for (String listItem : arl) {
            System.out.println(listItem.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arl = new ArrayList<>();
        arl.add("Сергей");
        arl.add("Виктор");
        arl.add("Вячеслав");
        arl.add("Георгий");
        arl.add("Олег");

        /**
         * Классический Iterator
         */
        Iterator itr = arl.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        /**
         * Итерация с помощью метода iterate(ArrayList<String> arl)
         */
        iterate(arl);
    }
}
