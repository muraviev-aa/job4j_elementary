package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Lusja Zvetkova";
        names[1] = "Teodor Backer";
        names[2] = "Mark Conor";

        System.out.println("Размер ages равен: " + ages.length);
        System.out.println("Размер surnames равен: " + surnames.length);
        System.out.println("Размер prices равен: " + prices.length);
        System.out.println("----");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
