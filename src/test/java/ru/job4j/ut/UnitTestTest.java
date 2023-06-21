package ru.job4j.ut;

import static org.assertj.core.api.Assertions.filter;
import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;

public class UnitTestTest {
    @Test
    public void whenEqualsLinkedListThenTrue() {
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        LinkedList<Integer> b = new LinkedList<Integer>();
        b.add(1);
        b.add(2);
        b.add(3);
        boolean result = a.equals(b);
        assertThat(result).isTrue();
    }

    @Test
    public void testAssert() {
        Integer a = 1;
        Integer b = 1;
        Integer c = 3;
        assertEquals(a, b);
        assertTrue(c > 1);
    }
}
