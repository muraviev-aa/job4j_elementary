package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double allFourOperation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета СУММЫ СУММЫ И УМНОЖЕНИЯ равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета СУММЫ РАЗНОСТИ И ДЕЛЕНИЯ равен: " + subAndDivision(10, 20));
        System.out.println("Результат расчета СУММЫ ВСЕХ ЧЕТЫРЕХ ОПЕРАЦИЙ равен: " + allFourOperation(10, 20));
    }

}
