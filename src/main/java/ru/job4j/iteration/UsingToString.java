package ru.job4j.iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UsingToString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Раз");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        list.add("Пять");

        /**
         * Строковое представление с помощью toString()
         */
        System.out.println(list.toString());

        /**
         * Способ Java 8
         */
        Stream.of(list.toString()).forEach(System.out::println);
    }
}
