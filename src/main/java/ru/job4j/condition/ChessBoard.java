package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 != x2 && y1 != y2) {
                if (math(x2, x1) == math(y2, y1)) {
                    rsl = math(x2, x1);
                }
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static int math(int value1, int value2) {
        return Math.abs(value1 - value2);
    }

    public static void main(String[] args) {
        System.out.println("Результат1: " + way(6, 7, 1, 2));
        System.out.println("Результат2: " + way(7, 0, 0, 7));
        System.out.println("Результат3: " + way(2, 6, 4, 1));
        System.out.println("Результат4: " + way(-1, 6, 4, 1));
        System.out.println("Результат5: " + way(2, -1, 4, 1));
        System.out.println("Результат6: " + way(2, 6, -1, 1));
        System.out.println("Результат7: " + way(2, 6, 4, -1));
        System.out.println("Результат8: " + way(10, 6, 4, 1));
        System.out.println("Результат9: " + way(2, 10, 4, 1));
        System.out.println("Результат10: " + way(2, 6, 10, 1));
        System.out.println("Результат11: " + way(2, 6, 4, 10));
    }
}
