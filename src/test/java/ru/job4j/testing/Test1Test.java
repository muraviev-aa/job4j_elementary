package ru.job4j.testing;

import org.junit.Assert;
import org.junit.Test;

public class Test1Test {

    @Test
    public void whenResultFalse() {
        boolean result = Test1.isStringLong("abc");
        Assert.assertFalse(result);
    }

    @Test
    public void whenResultTrue() {
        boolean result = Test1.isStringLong("abcdef");
        Assert.assertTrue(result);
    }
}