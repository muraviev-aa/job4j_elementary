package ru.job4j.shop;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = null;
        String className = args[0];
        System.out.println("Создание экземпляра класса: " + className + "\n");
        try {
            shop = (Shop) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] inventory = shop.getInventory();

        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Аргумент " + i + " = " + inventory[i]);
        }

        shop.buyInventory(inventory[1]);
    }
}
