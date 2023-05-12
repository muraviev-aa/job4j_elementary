package ru.job4j.attributes;

/**
 * Атрибуты классов
 */
public class ClassAttributes {
    static int count = 10;

    public void method1() {
        System.out.println(count);
    }

    public void method2() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        ClassAttributes classAttributes1 = new ClassAttributes();
        classAttributes1.method1();
        ClassAttributes classAttributes2 = new ClassAttributes();
        classAttributes2.method2();
    }
}
