package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SquareTest {

    @Test
    public void calculate4() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void calculate5() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        Assert.assertArrayEquals(expected, result);
    }
}