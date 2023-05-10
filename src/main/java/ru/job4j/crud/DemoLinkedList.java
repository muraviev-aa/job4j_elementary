package ru.job4j.crud;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        String str1 = new String("Hellow!");
        String str2 = new String("My name is Alex");
        String str3 = new String("I love Java!");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(str1);
        linkedList.add(str2);
        linkedList.add(str3);
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
