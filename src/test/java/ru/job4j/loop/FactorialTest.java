package ru.job4j.loop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor5Then120() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int expected = 1;
        int n = 0;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }
}