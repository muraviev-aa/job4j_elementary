package ru.job4j.loads;

import java.util.Arrays;

public class ArrayDemo {
    public static double[] shiftArr(double[] numbers, int shift) {
        while (shift > 0) {
            double lastVar = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length; i++) {
                double curVal = numbers[i];
                numbers[i] = lastVar;
                lastVar = curVal;
            }
            shift--;
        }
        return numbers;
    }

    public static void main(String[] args) {
        double[] factor = {1.0, 0.9, 0.7, 0.7, 0.7};
        System.out.println("Массив коэффициентов: " + Arrays.toString(factor));

        String[] forceT = {"Pt1", "Pt2", "Pt3", "Pt4", "Pt5"};
        System.out.println("Массив сил: " + Arrays.toString(forceT));

        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(shiftArr(factor, 0)));
        System.out.println(Arrays.toString(shiftArr(factor, 4)));
        System.out.println(Arrays.toString(shiftArr(factor, 4)));
        System.out.println(Arrays.toString(shiftArr(factor, 4)));
        System.out.println(Arrays.toString(shiftArr(factor, 4)));
        System.out.println("--------------------------------------");
    }
}
