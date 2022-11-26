package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static String maxLeftNumber(int left, int right) {
        return left > right ? "Первое максимальное" : "Второе максимальное";
    }

    public static String maxRightNumber(int left, int right) {
        return left < right ? "Второе максимальное" : "Первое максимальное";
    }

    public static String equalNumbers(int left, int right) {
        return left == right ? "Оба одинаковые" : "";
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 2);
        System.out.println("Maximum number: " + rsl);

        String rsl1 = Max.maxLeftNumber(4, 1);
        System.out.println(rsl1);

        String rsl2 = Max.maxRightNumber(1, 4);
        System.out.println(rsl2);

        String rsl3 = Max.equalNumbers(4, 4);
        System.out.println(rsl3);
    }
}
