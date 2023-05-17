package ru.job4j.shop;

public class PizzaShop extends Shop implements Nameable {
    String companyName;
    String[] foodOfferings = {
            "Пицца",
            "Спагетти",
            "Овощной салат",
            "Антипасто",
            "Кальцоне"
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
        return foodOfferings;
    }

    @Override
    public void buyInventory(String item) {
        System.out.println("\nВы только что приобрели " + item);
    }
}
