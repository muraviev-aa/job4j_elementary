package ru.job4j.text;

import java.io.*;

public class FileOutputStreamDemo {
    public double calcSqrt(double number) {
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        double a = 12.3;
        FileOutputStreamDemo calcInFile = new FileOutputStreamDemo();

        String source = """
             Как и в продающих текстах, в статьях копирайтеров ценятся и гармоничная работа с ключами, 
            и здравый смысл. Но есть детали, характерные именно для обширных текстов (лонгридов).
             Есть разновидности текстов, которые у копирайтеров принято называть “Поток сознания”. Автор 
            так увлечен своими эмоциями, что через минуту читателя начинает потряхивать: то от раздражения, 
            то от смеха.
            """;
        String source1 = String.valueOf(calcInFile.calcSqrt(a));
        String rsl = source + " Корень квадратный из a равен: " + source1;

        try (FileOutputStream f = new FileOutputStream("E:/ITMO/Java_new/file.txt");) {
            f.write(rsl.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
