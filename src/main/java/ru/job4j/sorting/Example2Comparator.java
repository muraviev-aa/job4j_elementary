package ru.job4j.sorting;

import java.util.Comparator;

public class Example2Comparator implements Comparator<Example2> {
    @Override
    public int compare(Example2 o1, Example2 o2) {
        return o1.getManufactureYear() - o2.getManufactureYear();
    }
}
