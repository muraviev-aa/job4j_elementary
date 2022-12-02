package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int index = 0; index < word.length; index++) {
            if (word[index] == pref[index]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
