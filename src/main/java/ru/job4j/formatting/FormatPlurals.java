package ru.job4j.formatting;

public class FormatPlurals {
    /** Форматирование в соответствии с множественным
     * числом имен существительных с использованием тернарного оператора
     */
    public static void report(int n) {
        System.out.println("We used " + n + " item" + (n == 1 ? "" : "s"));
    }

    public static void main(String[] args) {
        report(0);
        report(1);
        report(2);
    }
}
