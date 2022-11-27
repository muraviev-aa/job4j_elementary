package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first && first > third || second == third) {
            result = second;
        }
        if (second > first && third > second) {
            result = third;
        }
        return result;
    }
}
