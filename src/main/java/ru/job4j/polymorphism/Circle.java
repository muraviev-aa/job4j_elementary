package ru.job4j.polymorphism;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = 3.14 * radius * radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Я рисую круг");
    }
}
