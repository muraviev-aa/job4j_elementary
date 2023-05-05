package ru.job4j.iteration;

import java.util.Arrays;
import java.util.List;

public class UsingForAndForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Раз", "Два", "Три", "Четыре", "Пять");
        /**
         * С помощью цикла for
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /**
         * С помощью цикла for-each
         */
        for (String s: list){
            System.out.println(s);
        }
    }
}
