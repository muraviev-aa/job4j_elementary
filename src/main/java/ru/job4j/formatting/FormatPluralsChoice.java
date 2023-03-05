package ru.job4j.formatting;

import java.text.ChoiceFormat;

public class FormatPluralsChoice extends FormatPlurals {
    static double[] limits = {0, 1, 2};
    static String[] formats = {"items", "item", "items"};
    /** Форматирование в соответствии с множественным
     * числом имен существительных с использованием ChoiceFormat */
    static ChoiceFormat myFormat = new ChoiceFormat(limits, formats);

    public static void main(String[] args) {
        report(0);
        report(1);
        report(2);
    }
}
