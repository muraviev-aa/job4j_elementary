package ru.job4j.date;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateDiff {
    public static void main(String[] args) {
        /**
         * Конечная дата
         */
        Date d1 = new GregorianCalendar(1999, 11, 31, 2, 59).getTime();
        /**
         * Текущая дата
         */
        Date d2 = new Date();
        /**
         * Получить миллисекунды от каждой и произвести вычитание
         */
        Long diff = d2.getTime() - d1.getTime();
        System.out.println("Difference between " + d2 + "\n" + "\tand Y2K is "
                + (diff / (1000 * 60 * 60 * 24)) + " days.");
    }
}
