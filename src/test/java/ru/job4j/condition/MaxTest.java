package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMaxTo1to2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = right;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void whenMaxTo1to2Then1() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = left;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMaxTo2to2Then1() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = left;
        Assert.assertEquals(expected, result);
    }
}