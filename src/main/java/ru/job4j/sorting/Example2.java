package ru.job4j.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 implements Comparable<Example2> {
    private int manufactureYear;
    private String model;
    private int count;

    @Override
    public String toString() {
        return "Example2{"
                + "manufactureYear=" + manufactureYear
                + ", model='" + model + '\''
                + ", count=" + count
                + '}';
    }

    public Example2(int manufactureYear, String model, int count) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.count = count;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(Example2 o) {
        return this.getCount() - o.getCount();
    }

    public static void main(String[] args) {
        List<Example2> example2 = new ArrayList<>();
        Example2 old = new Example2(1965, "OLD", 700);
        Example2 youthful = new Example2(1985, "YOUTHFUL", 200);
        Example2 young = new Example2(1995, "YOUNG", 500);

        example2.add(old);
        example2.add(youthful);
        example2.add(young);

        /**
         * Сортировка по количеству. Интерфейс Comparable
         */
        Collections.sort(example2);
        System.out.println(example2);

        List<Example2> example3 = new ArrayList<>();
        Example2 old3 = new Example2(1965, "OLD", 700);
        Example2 youthful3 = new Example2(1985, "YOUTHFUL", 200);
        Example2 young3 = new Example2(1995, "YOUNG", 500);

        example3.add(old3);
        example3.add(youthful3);
        example3.add(young3);

        Comparator manufactureYear = new Example2Comparator();
        /**
         * Сортировка по году производства. Интерфейс Comparator
         */
        Collections.sort(example3, manufactureYear);
        System.out.println(example3);
    }
}
