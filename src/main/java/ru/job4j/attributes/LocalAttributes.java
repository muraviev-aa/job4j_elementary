package ru.job4j.attributes;

/**
 * Локальные атрибуты
 */
public class LocalAttributes {
    public void method1() {
        int count = 10;
        System.out.println(count);
    }

    public void method2() {
        int count = 20;
        System.out.println(count);
    }

    public static void main(String[] args) {
        LocalAttributes localAttributes1 = new LocalAttributes();
        localAttributes1.method1();
        LocalAttributes localAttributes2 = new LocalAttributes();
        localAttributes2.method2();
    }
}
