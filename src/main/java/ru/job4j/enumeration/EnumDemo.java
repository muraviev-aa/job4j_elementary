package ru.job4j.enumeration;

public class EnumDemo {
    public static void main(String[] args) {
        Guitar guitar;
        guitar = Guitar.FENDER;
        System.out.println(guitar);

        switch (guitar) {
            case FENDER -> System.out.println("Производитель гитары FENDER");
            case PRS -> System.out.println("Производитель гитары PRS");
            case OLSON -> System.out.println("Производитель гитары OLSON");
            case RYAN -> System.out.println("Производитель гитары RYAN");
            case GIBSON -> System.out.println("Производитель гитары GIBSON");
            case MARTIN -> System.out.println("Производитель гитары MARTIN");
            case COLLINGS -> System.out.println("Производитель гитары COLLINGS");
            default -> System.out.println("Мастеровая");
        }

        System.out.println();
        Guitar[] guitars = Guitar.values();
        for (Guitar g : guitars) {
            System.out.println(g);
        }
    }
}
