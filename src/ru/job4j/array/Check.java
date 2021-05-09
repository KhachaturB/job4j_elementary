package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean etalon = data[0];
        for (boolean item : data) {
            if (item != etalon) {
                return false;
            }
        }
        return true;
    }
}
