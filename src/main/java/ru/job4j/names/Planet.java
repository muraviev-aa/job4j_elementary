package ru.job4j.names;

public class Planet implements Nameable {
    private String planetName;

    @Override
    public String getName() {
        return planetName;
    }

    @Override
    public void setName(String name) {
        planetName = name;
    }
}
