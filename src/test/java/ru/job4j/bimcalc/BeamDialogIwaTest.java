package ru.job4j.bimcalc;

import org.junit.jupiter.api.*;

class BeamDialogIwaTest {

    @Test
    void when400x16And250x10And666x8Then4133Point63() {
        double tf1 = 1.6;
        double tf2 = 1.0;
        double tw = 0.8;
        double h = 66.6;
        double b = 40;
        double d = 25;
        double aycg = 23.62;
        double expected = 4133.63;
        BeamDialogIwa beamDialogIwa = new BeamDialogIwa();
        double out = beamDialogIwa.calcMomentOfResistance1(tf1, tf2, tw, h, b, d, aycg);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    void when400x16And250x10And666x8Then2393Point16() {
        double tf1 = 1.6;
        double tf2 = 1.0;
        double tw = 0.8;
        double h = 66.6;
        double b = 40;
        double d = 25;
        double aycg = 23.62;
        double expected = 2393.16;
        BeamDialogIwa beamDialogIwa = new BeamDialogIwa();
        double out = beamDialogIwa.calcMomentOfResistance2(tf1, tf2, tw, h, b, d, aycg);
        Assertions.assertEquals(expected, out, 0.01);
    }
}