package ru.job4j.singleton;

public class Singleton {
    public static void main(String[] args) {
        Counter counter1 = Counter.getInstance();
        counter1.incrementCounter();
        counter1.incrementCounter();
        System.out.println("Счетчик: " + counter1.getCounter());

        Counter counter2 = Counter.getInstance();
        counter2.incrementCounter();
        System.out.println("Счетчик: " + counter2.getCounter());
    }
}
