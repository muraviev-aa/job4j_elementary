package ru.job4j.polymorphism;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 5);

        Stack stack = new Stack();
        stack.push(circle);
        stack.push(rectangle);

        while (!stack.empty()) {
            Shape shape = (Shape) stack.pop();
            System.out.println("Площадь = " + shape.getArea());
        }
    }
}
