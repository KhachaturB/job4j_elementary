package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int number = 5;
        int expected = 120;

        int factorial = Factorial.calc(number);

        Assert.assertEquals(expected, factorial);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int expected = 1;

        int factorial = Factorial.calc(number);

        Assert.assertEquals(expected, factorial);
    }
}
