package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        System.out.println("Треугольни существует: " + exist(10.2, 10.3, 10.4));
        System.out.println("Треугольни существует: " + exist(100.2, 10.3, 10.4));
    }
}
