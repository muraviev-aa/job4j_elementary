package ru.job4j.bimcalc;

public interface SectionU extends Bimoment {
    double calcSectorialCoordinateW2(double b, double tw, double ax, double h, double tf);

    double calcSectorialMomentInertia(double tw, double h, double tf, double w1, double b, double w2);

    double calcMomentInertiaTorsion(double b, double tf, double h, double tw);

    default double normalStressBimomentPoint1(double bmax, double w1, double iw) {
        return roundWhole((-1) * (bmax * w1) / iw);
    }

    default double normalStressBimomentPoint2(double bmax, double w2, double iw) {
        return roundWhole((bmax * w2) / iw);
    }

    default double normalStressBimomentPoint3(double bmax, double w1, double iw) {
        return roundWhole((-1) * normalStressBimomentPoint1(bmax, w1, iw));
    }

    default double normalStressBimomentPoint4(double bmax, double w2, double iw) {
        return roundWhole((-1) * normalStressBimomentPoint2(bmax, w2, iw));
    }

    default double normalStressMomentPoint1And2(double mmax, double wx) {
        return roundWhole((-1) * normalStressMomentPoint3And4(mmax, wx));
    }

    default double normalStressMomentPoint3And4(double mmax, double wx) {
        return roundWhole(mmax / wx);
    }
}
