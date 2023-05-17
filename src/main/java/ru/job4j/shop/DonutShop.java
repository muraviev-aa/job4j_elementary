package ru.job4j.shop;

public class DonutShop extends Shop implements Nameable {
    String companyName;
    String[] menuItem = {
            "Пончики",
            "Маффины",
            "Пирожное из слоеного теста",
            "Кофе",
            "Чай"
    };

    @Override
    public String getName() {
        return companyName;
    }

    @Override
    public void setName(String name) {
        companyName = name;
    }

    @Override
    public String[] getInventory() {
        return menuItem;
    }

    @Override
    public void buyInventory(String item) {
        System.out.println("\nВы только что приобрели " + item);
    }
}
