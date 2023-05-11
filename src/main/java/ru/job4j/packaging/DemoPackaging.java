package ru.job4j.packaging;

public class DemoPackaging {
    public static void num(Integer x) {
        System.out.println("Значение типа Integer:" + x);
    }

    public static void main(String[] args) {
        int a = 2;
        Integer b;
        b = a;
        System.out.println("Integer b = " + b);

        num(a);

        Integer c = 10;
        int d = c;
        System.out.println("int d = " + d);

        Integer e = 2;
        Integer f = 4;
        System.out.println("The result of multiplication: " + e * f);

        /**
         * Сравнение по ссылкам (результат false)
         */
        Integer g = 300;
        Integer h = 300;
        System.out.println(g == h);

        /**
         * Кэшированные значения из пула Integer (от -128 до 127 включительно)
         * ссылки ведут на элемент из кэша
         */
        Integer k = 125;
        Integer l = 125;
        System.out.println(k == l);
    }
}
