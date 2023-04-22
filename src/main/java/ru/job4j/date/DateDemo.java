package ru.job4j.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date dNow = new Date();
        System.out.println("It is now " + dNow.toString());
        /** Используем SimpleDateFormat для печати даты */
        /** EEEE - день недели; yyyy - год; MM - месяц года; dd - день года;
         * hh - час; mm - минута; ss - секунда; a - половина суток (AM или PM)
         * zzz - временная зона */
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE yyyy.MM.dd 'at' hh:mm:ss a zzz");
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("It is " + formatter.format(dNow));
        System.out.println(formatter1.format(dNow));
    }
}
