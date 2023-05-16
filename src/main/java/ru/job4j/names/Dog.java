package ru.job4j.names;

public class Dog implements Nameable {
    private String dogName;
    private Head head;

    @Override
    public String getName() {
        return dogName;
    }

    @Override
    public void setName(String name) {
        dogName = name;
    }
}
