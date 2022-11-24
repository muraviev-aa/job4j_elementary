package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double subtraction(double first, double second) {
        return first - second;
    }

    public static double division(double first, double second) {
        return first / second;
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double allOperation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета СУММЫ И УМНОЖЕНИЯ равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета ВЫЧИТАНИЯ И ДЕЛЕНИЯ равен: " + subAndDivision(10, 20));
        System.out.println("Результат расчета ВСЕХ ЧЕТЫРЕХ ОПЕРАЦИЙ равен: " + allOperation(10, 20));
    }
}
