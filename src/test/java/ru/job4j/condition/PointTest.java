package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void when000to555then8and66() {
        double expected = 8.66;
        Point a = new Point(0, 0, 0);
        Point b = new Point(5, 5, 5);
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when101to585then9and79() {
        double expected = 9.79;
        Point a = new Point(1, 0, 1);
        Point b = new Point(5, 8, 5);
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.01);

    }
}