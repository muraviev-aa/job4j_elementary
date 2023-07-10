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

    public static void print(String[] forceConstant, double[] factorLongTime, String[] forceLongTime,
                      double[] factorShortTime, String[] forceShortTime) {
        System.out.println(forceConstant[0] + " + "
                + factorLongTime[0] + " * " + forceLongTime[0] + " + "
                + factorLongTime[1] + " * " + forceLongTime[1] + " + "
                + factorShortTime[0] + " * " + forceShortTime[0] + " + "
                + factorShortTime[1] + " * " + forceShortTime[1] + " + "
                + factorShortTime[2] + " * " + forceShortTime[2]);
    }

    public static void main(String[] args) {
        String[] forceConstant = {"Pd"};
        System.out.println("Постоянная нагрузка: " + Arrays.toString(forceConstant));

        String[] forceLongTime = {"Pl1", "Pl2"};
        System.out.println("Длительные нагрузки: " + Arrays.toString(forceLongTime));
        double[] factorLongTime = {1.0, 0.95};
        System.out.println("Коэффициенты сочетаний длительных нагрузок: " + Arrays.toString(factorLongTime) + "\n");

        String[] forceShortTime = {"Pt1", "Pt2", "Pt3"};
        System.out.println("Кратковременные нагрузки: " + Arrays.toString(forceShortTime));
        double[] factorShortTime = {1.0, 0.9, 0.7};
        System.out.println("Коэффициенты сочетаний кратковременных нагрузок: " + Arrays.toString(factorShortTime));

        System.out.println("--------------------------------------");
        System.out.println("Сочетание нагрузок:");
        shiftArr(factorLongTime, 0);
        shiftArr(factorShortTime, 0);
        print(forceConstant, factorLongTime, forceLongTime, factorShortTime, forceShortTime);
        shiftArr(factorLongTime, 0);
        shiftArr(factorShortTime, 2);
        print(forceConstant, factorLongTime, forceLongTime, factorShortTime, forceShortTime);
        shiftArr(factorLongTime, 0);
        shiftArr(factorShortTime, 2);
        print(forceConstant, factorLongTime, forceLongTime, factorShortTime, forceShortTime);

        shiftArr(factorLongTime, 1);
        shiftArr(factorShortTime, 2);
        print(forceConstant, factorLongTime, forceLongTime, factorShortTime, forceShortTime);
        shiftArr(factorLongTime, 0);
        shiftArr(factorShortTime, 2);
        print(forceConstant, factorLongTime, forceLongTime, factorShortTime, forceShortTime);
        shiftArr(factorLongTime, 0);
        shiftArr(factorShortTime, 2);
        print(forceConstant, factorLongTime, forceLongTime, factorShortTime, forceShortTime);
    }
}
