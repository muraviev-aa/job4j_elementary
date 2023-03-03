package ru.job4j.formatting;

import java.text.*;

public class NumFormat {
    // Числа подлежащие форматированию
    public static final double[] NUM = {
            0, 1, 22d / 7, 100.2345678
    };
    public static double number = 100.2345678;

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        // Настраиваем в виде 999.99[99]
        format.setMinimumIntegerDigits(3);  // Количество цифр до запятой
        format.setMinimumFractionDigits(2); // Минимальное количество цифр после запятой
        format.setMaximumFractionDigits(4); // Максимальное количество цифр после запятой
        for (int i = 0; i < NUM.length; i++) {
            System.out.println(NUM[i] + "\tformats as "
                    + format.format(NUM[i]));
        }

        System.out.println("---------------");
        NumberFormat format1 = new DecimalFormat("##0.##");
        format1.setMinimumIntegerDigits(4); // Количество цифр до запятой
        System.out.println(format1.format(number));
    }
}
