package ru.job4j.names;

public class Car implements Nameable {
    private String carName;

    @Override
    public String getName() {
        return carName;
    }

    @Override
    public void setName(String name) {
        carName = name;
    }
}
