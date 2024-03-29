package ru.job4j.date;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        /**
         * Сегодня
         */
        Calendar c = Calendar.getInstance();
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + c.get(Calendar.MONTH));
        System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of week: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of year: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week in Year: " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week in Month: " + c.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Day of week in Month: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Hour: " + c.get(Calendar.HOUR));
        System.out.println("AP or PM: " + c.get(Calendar.AM_PM));
        System.out.println("Hour (24-hour clock): " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + c.get(Calendar.MINUTE));
        System.out.println("Second: " + c.get(Calendar.SECOND));
    }
}
