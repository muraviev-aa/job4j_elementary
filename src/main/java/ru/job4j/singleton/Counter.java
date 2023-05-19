package ru.job4j.singleton;

public class Counter {
    private int counter;
    private static Counter instance = null;

    protected Counter() {
    }

    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
            System.out.println("Новый экземпляр создан\n");
        }
        return instance;
    }

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
