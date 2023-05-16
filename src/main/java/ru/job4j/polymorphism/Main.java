package ru.job4j.polymorphism;

import java.util.Stack;

public class Main {
    static void drawMe(Shape s) {
        s.draw();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 5);
        Triangle triangle = new Triangle(2, 1);

        Stack stack = new Stack();
        stack.push(circle);
        stack.push(rectangle);
        stack.push(triangle);

        while (!stack.empty()) {
            Shape shape = (Shape) stack.pop();
            System.out.println("Площадь = " + shape.getArea());
        }

        drawMe(circle);
        drawMe(rectangle);
        drawMe(triangle);
    }
}
