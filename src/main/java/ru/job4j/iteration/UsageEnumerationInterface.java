package ru.job4j.iteration;

import java.util.*;

public class UsageEnumerationInterface {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Раз", "Два", "Три", "Четыре", "Пять");

        /**
         * 1. Преобразование List в Vector
         */
        Enumeration<String> enumeration = new Vector(list).elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        /**
         * 2. `Collections.enumeration()` возвращает перечисление по
         * указанной коллекции
         */
        enumeration = Collections.enumeration(list);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
