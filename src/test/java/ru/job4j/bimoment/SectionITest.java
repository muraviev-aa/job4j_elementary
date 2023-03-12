package ru.job4j.bimoment;

import org.junit.Assert;
import org.junit.Test;

public class SectionITest {
    @Test
    public void when30SH1Then145Point5() {
        double h = 29.1;
        double b = 20;
        double expected = 145.5;
        IbeamDialog iBeam = new IbeamDialog();
        double out = iBeam.calcSectorialCoordinateW1(b, h);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30SH1Then287466Point67() {
        double h = 29.1;
        double tf = 1.1;
        double b = 20;
        double expected = 287466.67;
        IbeamDialog iBeam = new IbeamDialog();
        double out = iBeam.calcSectorialMomentInertia(tf, b, h);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30SH1Then28Point82() {
        double b = 20;
        double tf = 1.1;
        double h = 29.1;
        double tw = 0.8;
        double expected = 28.82;
        IbeamDialog iBeam = new IbeamDialog();
        double out = iBeam.calcMomentInertiaTorsion(b, tf, h, tw);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30SH1Then0Point0062006() {
        double it = 28.82;
        double iw = 287466.67;
        double expected = 0.0062006;
        IbeamDialog iBeam = new IbeamDialog();
        double out = iBeam.calcBendingTorsionalCharacteristic(it, iw);
        Assert.assertEquals(expected, out, 0.00000001);
    }
}