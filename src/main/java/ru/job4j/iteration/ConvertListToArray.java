package ru.job4j.iteration;

import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Раз", "Два", "Три", "Четыре", "Пять");
        String[] array = null;

        /**
         * 1. Использование метода List.toArray(T[])
         */
        array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));

        /**
         * 2. Использование метода List.toArray(T[]) без выделения памяти
         */
        array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        /**
         * 3. Использование метода List.toArray()
         */
        System.out.println(Arrays.toString(list.toArray()));

        /**
         * 4. Использование потока и ссылки на метод
         */
        array = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        /**
         * 5. Использование потока и лямбда-выражения
         */
        array = list.stream().toArray(n -> new String[n]);
        System.out.println(Arrays.toString(array));
    }
}
