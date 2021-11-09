package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom0To4Then6() {
        int start = 0;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom4To0Then0() {
        int start = 4;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}