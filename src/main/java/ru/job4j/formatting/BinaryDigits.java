package ru.job4j.formatting;

public class BinaryDigits {
    public static void main(String[] args) {
        /** valueOf() преобразует двоичную строку в целое число*/
        String bin = "101010";
        System.out.println(bin + " as an integer is " + Integer.valueOf(bin, 2));

        /** toBinaryString() преобразует целое число в двоичное */
        int i = 42;
        System.out.println(i + " as binary digits (bits) is " + Integer.toBinaryString(i));
    }
}
