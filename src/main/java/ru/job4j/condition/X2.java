package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);

        a = 1;
        b = 1;
        c = 1;
        x = 1;
        rsl = X2.calc(a, b, c, x);
        System.out.println("Вариант a = 1, b = 1, c = 1, x = 1: " + rsl);

        a = 0;
        b = 1;
        c = 1;
        x = 1;
        rsl = X2.calc(a, b, c, x);
        System.out.println("Вариант a = 0, b = 1, c = 1, x = 1: " + rsl);

        a = 1;
        b = 1;
        c = 0;
        x = 1;
        rsl = X2.calc(a, b, c, x);
        System.out.println("Вариант a = 1, b = 1, c = 0, x = 1: " + rsl);

        a = 1;
        b = 1;
        c = 1;
        x = 0;
        rsl = X2.calc(a, b, c, x);
        System.out.println("Вариант a = 1, b = 1, c = 1, x = 0: " + rsl);
    }
}
