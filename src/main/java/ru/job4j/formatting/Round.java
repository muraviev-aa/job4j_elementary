package ru.job4j.formatting;

public class Round {
    /** Округляем число в большую сторону,
     * если его дробная часть превышает этот порог */
    public static final double THRESHOLD = 0.54;

    static long round(double d) {
        long di = (long) Math.floor(d);
        if ((d - di) > THRESHOLD) {
            return di + 1;
        } else {
            return di;
        }
    }

    public static void main(String[] args) {
        double a = 3.999999;
        /** Округление до числа с плавающей точкой до ближайшего
         * целого с помощью метода round() */
        System.out.println(round(a));

        int b = (int) a;
        /** Округление без использования метода round() */
        System.out.println(b);

        double c = 3.55;
        System.out.println(round(c));
        double d = 3.54;
        System.out.println(round(d));
    }
}
