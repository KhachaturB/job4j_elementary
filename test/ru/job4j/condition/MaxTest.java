package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxForThreeThen7() {
        int first = 5;
        int second = 2;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxForFourThen15() {
        int first = 10;
        int second = 15;
        int third = 3;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }
}
