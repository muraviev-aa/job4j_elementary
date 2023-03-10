package ru.job4j.formatting;

public class Round {
    /** Округляем число в большую сторону,
     * если его дробная часть превышает этот порог
     */
    public static final double THRESHOLD = 0.54;

    static long round(double d) {
        long di = (long) Math.floor(d);
        if ((d - di) > THRESHOLD) {
            return di + 1;
        } else {
            return di;
        }
    }

    /**
     * Вариант округления
     */
    static double roundOne(double d) {
        double scale = Math.pow(10, 1);
        return Math.ceil(d * scale) / scale;
    }

    static double roundTwo(double d) {
        double scale = Math.pow(10, 2);
        return Math.ceil(d * scale) / scale;
    }

    static double roundEight(double d) {
        double scale = Math.pow(10, 8);
        return Math.ceil(d * scale) / scale;
    }

    public static void main(String[] args) {
        double a = 3.999999;
        /** Округление до числа с плавающей точкой до ближайшего
         * целого с помощью метода round()
         */
        System.out.println(round(a));

        int b = (int) a;
        /**
         * Округление без использования метода round()
         */
        System.out.println(b);
        double c = 3.55;
        System.out.println(round(c));
        double d = 3.54;
        System.out.println(round(d));
        System.out.println("---");
        double e = 5.123456789;
        System.out.println(roundOne(e));
        System.out.println(roundTwo(e));
        System.out.println(roundEight(e));
    }
}
