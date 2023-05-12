package ru.job4j.attributes;

/**
 * Атрибуты объектов
 */
public class ObjectAttributes {
    int count = 10;

    public void method1() {
        count = 20;
        System.out.println(count);
    }

    public void method2() {
        count = 30;
        System.out.println(count);
    }

    public  void method3() {
        int count = 40;
        System.out.println(count);
        System.out.println(this.count);
    }

    public static void main(String[] args) {
        ObjectAttributes objectAttributes1 = new ObjectAttributes();
        objectAttributes1.method1();
        ObjectAttributes objectAttributes2 = new ObjectAttributes();
        objectAttributes2.method2();
        ObjectAttributes objectAttributes3 = new ObjectAttributes();
        objectAttributes3.method3();
    }
}
