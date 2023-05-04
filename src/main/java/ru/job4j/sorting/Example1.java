package ru.job4j.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        String name1 = "Яков";
        String name2 = "Семен";
        String name3 = "Георгий";
        String name4 = "Иван";
        String name5 = "Олег";

        List<String> names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);

        Collections.sort(names);
        System.out.println(names);
    }
}
