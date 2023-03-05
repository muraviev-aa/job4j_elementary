package ru.job4j.formatting;

import java.text.*;

public class NumFormat {
    /** Числа подлежащие форматированию */
    public static final double[] NUM = {
            0, 1, 22d / 7, 100.2345678
    };
    public static double number = 100.2345678;

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        /** Настраиваем вывод чисел в виде 999.99[99] */
        /** setMinimumIntegerDigits() количество цифр до запятой */
        format.setMinimumIntegerDigits(3);
        /** setMinimumFractionDigits() минимальное количество цифр после запятой */
        format.setMinimumFractionDigits(2);
        /** setMaximumFractionDigits(4) максимальное количество цифр после запятой */
        format.setMaximumFractionDigits(4);
        for (int i = 0; i < NUM.length; i++) {
            System.out.println(NUM[i] + "\tformats as "
                    + format.format(NUM[i]));
        }

        System.out.println("---------------");
        NumberFormat format1 = new DecimalFormat("##0.##");
        /** setMinimumIntegerDigits() количество цифр до запятой */
        format1.setMinimumIntegerDigits(4);
        System.out.println(format1.format(number));
    }
}
