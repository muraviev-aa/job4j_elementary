package ru.job4j.cabbie;

public class Cabbie {
    private static String companyName = "Blue Cab Company";
    private String name;
    private Cab myCab;

    public Cabbie() {
        name = null;
        myCab = null;
    }

    public Cabbie(String name, String serialNumber) {
        this.name = name;
        myCab = new Cab(serialNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public void giveDestination() {
        turnRight();
        turnLeft();
    }

    private void turnRight() {
        System.out.println("Повернуть направо!");
    }

    private void turnLeft() {
        System.out.println("Повернуть налево!");
    }
}
