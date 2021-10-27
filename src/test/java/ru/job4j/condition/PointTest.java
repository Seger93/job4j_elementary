package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to00Then2() {
        double expected = 2.82;
        int x1 = 2;
        int y1 = 2;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1002to0180Then2() {
        double expected = 204.16;
        int x1 = 100;
        int y1 = 2;
        int x2 = 0;
        int y2 = 180;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when100200to486180Then2() {
        double expected = 386.51;
        int x1 = 100;
        int y1 = 200;
        int x2 = 486;
        int y2 = 180;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}