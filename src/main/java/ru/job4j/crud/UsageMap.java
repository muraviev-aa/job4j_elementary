package ru.job4j.crud;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void hashMapPart1(HashMap<String, String> map) {
        System.out.println(map.toString());

        System.out.println("------------------");

        /**
         * Метод keySet() возвращает коллекцию java.util.Set, состоящую только из ключей
         */
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        System.out.println("------------------");
    }

    public static void hashMapPart2(HashMap<String, String> map) {
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("------------------");

        /**
         * Удаление происходит по ключу через метод remove(key)
         */
        map.remove("parsentev@yandex.ru");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        /**
         * Вставляем данные в карту с помощью метода put()
         */
        map.put("muraviev-aa@yandex.ru", "Aleksey Muraviev");
        map.put("parsentev@yandex.ru", "Petr Arsentev");

        hashMapPart1(map);

        /**
         * Если в Map уже есть такой key, то ячейка value будет заменена на новое значение
         */
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        hashMapPart2(map);
    }
}
