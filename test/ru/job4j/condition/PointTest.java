package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus10to10then2() {
        int expected = 2;
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(1, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1Minus2to12then4() {
        int expected = 4;
        Point point1 = new Point(1, -2);
        Point point2 = new Point(1, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to003then3() {
        int expected = 3;
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(0, 0, 3);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when507to203then5() {
        int expected = 5;
        Point point1 = new Point(5, 0, 7);
        Point point2 = new Point(2, 0, 3);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
