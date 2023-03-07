package ru.job4j.formatting;

import java.math.BigInteger;

public class BigNums {
    public static void main(String[] args) {
        System.out.println("Floating point numbers: ");
        System.out.println("Here's Float.MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Here's Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("---");
        System.out.println("Integer type: ");
        System.out.println("Here's Byte.MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("Here's Short.MAX_VALUE: " + Short.MAX_VALUE);
        System.out.println("Here's Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Here's Long.MAX.VALUE: " + Long.MAX_VALUE);
        System.out.println("---");
        System.out.println("Character type: ");
        System.out.println("Here's Character.MAX_VALUE: " + (int) Character.MAX_VALUE);
        System.out.println("---");
        BigInteger bInt = new BigInteger("3419229223372036854775807");
        System.out.println("Here's a bigger number: " + bInt);
        System.out.println("Here it is as a double: " + bInt.doubleValue());
    }
}
