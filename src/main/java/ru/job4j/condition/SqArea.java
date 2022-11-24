package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, realArea = " + result);

        double result1 = SqArea.square(7, 2);
        System.out.println(" p = 7, k = 2, s = 2.72, realArea = " + result1);

        double result2 = SqArea.square(8, 3);
        System.out.println(" p = 8, k = 3, s = 3, realArea = " + result2);
    }
}
