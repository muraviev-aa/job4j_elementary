package ru.job4j.cabbie;

public class TestPerson {
    public static void main(String[] args) {
        Cabbie joe = new Cabbie("Joe", "1234");
        System.out.println(joe.getName());
        System.out.println(Cabbie.getCompanyName());
        joe.giveDestination();
    }
}
