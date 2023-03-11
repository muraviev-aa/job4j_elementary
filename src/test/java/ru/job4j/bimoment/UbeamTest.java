package ru.job4j.bimoment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UbeamTest {

    @Test
    public void when27PThen3Point13() {
        double b = 9.5;
        double tw = 0.6;
        double tf = 1.05;
        int h = 27;
        double expected = 3.13;
        Ubeam ubeam = new Ubeam();
        double out = ubeam.calcBendCenter(b, tw, h, tf);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27PThen40Point6() {
        double ax = 3.13;
        int h = 27;
        double tf = 1.05;
        double expected = 40.62;
        Ubeam ubeam = new Ubeam();
        double out = ubeam.calcSectorialCoordinateW1(ax, h, tf);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27PThen78Point76() {
        double b = 9.5;
        double tw = 0.6;
        double ax = 3.13;
        int h = 27;
        double tf = 1.05;
        double expected = 78.76;
        Ubeam ubeam = new Ubeam();
        double out = ubeam.calcSectorialCoordinateW2(b, tw, ax, h, tf);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27PThen38534Point48() {
        double tw = 0.6;
        int h = 27;
        double tf = 1.05;
        double b = 9.5;
        double w1 = 40.62;
        double w2 = 78.76;
        double expected = 38534.48;
        Ubeam ubeam = new Ubeam();
        double out = ubeam.calcSectorialMomentInertia(tw, h, tf, w1, b, w2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27PThen10Point22() {
        double b = 9.5;
        double tf = 1.05;
        int h = 27;
        double tw = 0.6;
        double expected = 10.22;
        Ubeam ubeam = new Ubeam();
        double out = ubeam.calcMomentInertiaTorsion(b, tf, h, tw);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27PThen0Point01008511() {
        double it = 10.22;
        double iw = 38534.48;
        double expected = 0.01008511;
        Ubeam ubeam = new Ubeam();
        double out = ubeam.calcBendingTorsionalCharacteristic(it, iw);
        Assert.assertEquals(expected, out, 0.00000001);
    }

    @Test
    public void when27PForce2100Then828996Point8() {
        double p = 2100;
        double e = 8;
        double k = 0.01008511;
        double l = 600;
        double expected = 828996.8;
        Ubeam ubeam = new Ubeam();
        double out = ubeam.calcBimomentMax1(p, e, k, l);
        Assert.assertEquals(expected, out, 0.1);
    }
}