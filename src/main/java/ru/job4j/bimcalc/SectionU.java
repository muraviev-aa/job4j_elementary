package ru.job4j.bimcalc;

public interface SectionU {
    double calcSectorialCoordinateW2(double b, double tw, double ax, double h, double tf);

    double calcSectorialMomentInertia(double tw, double h, double tf, double w1, double b, double w2);

    double calcMomentInertiaTorsion(double b, double tf, double h, double tw);
}
