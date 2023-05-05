package ru.job4j.iteration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Раз", "Два", "Три", "Четыре", "Пять");

        /**
         * Получаем поток и используем лямбда-выражение. Вариант 1
         */
        list.stream().forEach(S -> {
            System.out.println(S);
        });

        System.out.println("-------");

        /**
         * Получаем поток и используем лямбда-выражение. Вариант 2 (сокращенный)
         */
        list.stream().forEach(S -> System.out.println(S));

        System.out.println("-------");

        /**
         * Ссылка на метод
         */
        list.stream().forEach(System.out::println);

        System.out.println("-------");

        /**
         * Наследуем метод forEach() от интерфейса Iterable
         */
        list.forEach(System.out::println);

        System.out.println("-------");

        /**
         * Используем Stream.of для получения Stream<String>
         */
        Stream.of(list.toArray())
                .forEach(System.out::println);
    }
}
