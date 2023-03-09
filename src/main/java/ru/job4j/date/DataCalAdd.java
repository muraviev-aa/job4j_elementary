package ru.job4j.date;

import java.util.*;
import java.text.*;

public class DataCalAdd {
    public static void main(String[] args) {
        /** Текущая дата */
        Calendar now = Calendar.getInstance();
        /** Форматирование даты в "простом" формате*/
        SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("It is now " + formatter.format(now.getTime()));
        now.add(Calendar.DAY_OF_YEAR, -(360 * 2));
        System.out.println("Two years ago was " + formatter.format(now.getTime()));
    }
}
