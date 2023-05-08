package ru.job4j.crud;

import java.util.HashMap;
import java.util.Map;

public class DemoEntry {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("Ivan", "Ivanov");
        students.put("Petr", "Petrov");
        students.put("Sidor", "Sidorov");

        for (Map.Entry<String, String> student : students.entrySet()) {
            System.out.println("Student name is = " + student.getKey()
                    + " and student lastname is = " + student.getValue());
        }
    }
}
