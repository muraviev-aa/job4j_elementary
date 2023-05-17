package ru.job4j.shop;

public abstract class Shop {
    CustList customerList;

    public void calculateSaleTax() {
        System.out.println("Вычисление налога на продажу");
    }

    public abstract String[] getInventory();

    public abstract void buyInventory(String item);
}
