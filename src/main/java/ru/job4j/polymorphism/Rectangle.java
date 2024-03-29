package ru.job4j.polymorphism;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        area = length * width;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Я рисую прямоугольник");
    }
}
