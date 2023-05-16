package ru.job4j.polymorphism;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        area = 0.5 * height * base;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Я рисую треугольник");
    }
}
