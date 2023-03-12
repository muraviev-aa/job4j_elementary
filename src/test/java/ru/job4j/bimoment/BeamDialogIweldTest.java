package ru.job4j.bimoment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeamDialogIweldTest {

    @Test
    public void when400x16And250x10And666x8Then8Point65() {
        double b = 40;
        double h = 66.6;
        double tf1 = 1.6;
        double tf2 = 1;
        double d = 25;
        double expected = 8.65;
        BeamDialogIweld beamDialogIweld = new BeamDialogIweld();
        double out = beamDialogIweld.calcBendCenter(b, h, tf1, tf2, d);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when400x16And250x10And666x8Then173Point0() {
        double b = 40;
        double ay = 8.65;
        double expected = 173.0;
        BeamDialogIweld beamDialogIweld = new BeamDialogIweld();
        double out = beamDialogIweld.calcSectorialCoordinateW1(b, ay);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when400x16And250x10And666x8Then708Point13() {
        double d = 25;
        double ay = 8.65;
        double h = 66.6;
        double tf1 = 1.6;
        double tf2 = 1;
        double expected = 708.13;
        BeamDialogIweld beamDialogIweld = new BeamDialogIweld();
        double out = beamDialogIweld.calcSectorialCoordinateW2(d, ay, h, tf1, tf2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when400x16And250x10And666x8Then4817160Point21() {
        double tf1 = 1.6;
        double tf2 = 1;
        double b = 40;
        double d = 25;
        double h = 66.6;
        double expected = 4817160.21;
        BeamDialogIweld beamDialogIweld = new BeamDialogIweld();
        double out = beamDialogIweld.calcSectorialMomentInertia(tf1, tf2, b, d, h);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when400x16And250x10And666x8Then92Point34() {
        double b = 40;
        double tf1 = 1.6;
        double tf2 = 1;
        double d = 25;
        double h = 66.6;
        double tw = 0.8;
        double expected = 92.34;
        BeamDialogIweld beamDialogIweld = new BeamDialogIweld();
        double out = beamDialogIweld.calcMomentInertiaTorsion(b, tf1, d, tf2, h, tw);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when400x16And250x10And666x8Then0Point00271132() {
        double it = 92.34;
        double iw = 4817160.21;
        double expected = 0.00271132;
        BeamDialogIweld beamDialogIweld = new BeamDialogIweld();
        double out = beamDialogIweld.calcBendingTorsionalCharacteristic(it, iw);
        Assert.assertEquals(expected, out, 0.00000001);
    }
}