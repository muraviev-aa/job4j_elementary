package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 10.2;
        double ac = 10.3;
        double bc = 10.4;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 100.2;
        double ac = 10.3;
        double bc = 10.4;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }
}