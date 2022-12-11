package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to31then2() {
        double expected = 2;
        Point a = new Point(1, 1);
        Point b = new Point(3, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to65then7and81() {
        double expected = 7.81;
        Point a = new Point(0, 0);
        Point b = new Point(6, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }
}