package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = rightIndex == right.length ? left[leftIndex++]
                    : leftIndex == left.length ? right[rightIndex++]
                    : left[leftIndex] < right[rightIndex]
                    ? left[leftIndex++] : right[rightIndex++];
        }
        return rsl;
    }
}