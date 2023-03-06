package ru.job4j.formatting;

import java.util.Random;

public class Generation {
    public static void main(String[] args) {
        /** Метод random() генерирует только значения double */
        System.out.println(Math.random());
        System.out.println("---");
        /** Для генерации методом random() целых чисел необходимо
         * установить соответствующую точность и округлить */
        for (int i = 0; i < 3; i++) {
            System.out.println(0.01 + (int) (Math.random() * 100));
        }
        System.out.println("---");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(1 + (int) (Math.random() * 10));
        }
        System.out.println("---");

        /** Генерирование случайных чисел лучшего качества */
        Random r1 = new Random();
        System.out.println(r1.nextBoolean());
        System.out.println("---");
        for (int i = 0; i < 3; i++) {
            System.out.println(r1.nextInt());
        }
        System.out.println("---");
        for (int i = 0; i < 3; i++) {
            System.out.println(r1.nextDouble());
        }
        System.out.println("---");
        /** Гаусовское (нормальное) распределение */
        for (int i = 0; i < 3; i++) {
            System.out.println(r1.nextGaussian());
        }
    }
}
