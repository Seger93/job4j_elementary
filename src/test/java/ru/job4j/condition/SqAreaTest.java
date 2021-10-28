package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP0K200Square0() {
        double expected = 0;
        int p = 0;
        double k = 200;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP756K50Square2747Dot71() {
        double expected = 2746.71;
        int p = 756;
        double k = 50;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
}