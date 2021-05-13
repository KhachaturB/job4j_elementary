package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftIndex != left.length && rightIndex != right.length) {
                rsl[i] = left[leftIndex] < right[rightIndex]
                        ? left[leftIndex++]
                        : right[rightIndex++];
            }  else if (leftIndex != left.length) {
                rsl[i] = left[leftIndex++];
            } else if (rightIndex != right.length) {
                rsl[i] = right[rightIndex++];
            }
        }
        return rsl;
    }
}