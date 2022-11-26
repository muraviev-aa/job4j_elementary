package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeftMax4To1Then4() {
        int left = 4;
        int right = 1;
        String result = Max.maxLeftNumber(left, right);
        String expected = "Первое максимальное";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenRightMax1To4Then4() {
        int left = 1;
        int right = 4;
        String result = Max.maxRightNumber(left, right);
        String expected = "Второе максимальное";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenEqual4To4Then4() {
        int left = 4;
        int right = 4;
        String result = Max.equalNumbers(left, right);
        String expected = "Оба одинаковые";
        assertThat(result).isEqualTo(expected);
    }
}