package ru.job4j.bimcalc;

public class BeamDialogUp implements SectionU, Bimoment {
    /**
     * Расчет прокатного швеллера с параллельными полками
     */
    /**
     * Толщина полки [см]
     */
    private double tf;
    /**
     * Ширина полки [см]
     */
    private double b;
    /**
     * Толщина стенки [см]
     */
    private double tw;
    /**
     * Высота сечения [см]
     */
    private double h;
    /**
     * Сосредоточенная сила [кг]
     */
    private double p;
    /**
     * Эксцентриситет [см]
     */
    private double e;
    /**
     * Пролет балки [см]
     */
    private double l;
    /**
     * Координата центра изгиба [см]
     */
    private double ax;
    /**
     * Секториальный момент инерции [см6]
     */
    private double iw;
    /**
     * Главная секториальная координата w1 [см2]
     */
    private double w1;
    /**
     * Главная секториальная координата w2 [см2]
     */
    private double w2;
    /**
     * Момент инерции при чистом кручении [см4]
     */
    private double it;
    /**
     * Упругая изгибно-крутильная характеристика [1/см]
     */
    private double k;
    /**
     * Максимальный бимомент [кг/см2]
     */
    private double bmax;

    /**
     * Вычисление координаты центра изгиба ax [см]
     */
    double calcBendCenter(double b, double tw, double h, double tf) {
        ax = 3 * Math.pow((b - 0.5 * tw), 2) / ((h - tf)
                + 6 * (b - 0.5 * tw));
        return roundTwo(ax);
    }

    /**
     * Вычисление секториальной координаты W1 [см2]
     */
    double calcSectorialCoordinateW1(double ax, double h, double tf) {
        w1 = ax * 0.5 * (h - tf);
        return roundTwo(w1);
    }

    /**
     * Вычисление секториальной координаты W2 [см2]
     */
    @Override
    public double calcSectorialCoordinateW2(double b, double tw, double ax, double h, double tf) {
        w2 = ((b - 0.5 * tw) - ax) * 0.5 * (h - tf);
        return roundTwo(w2);
    }

    /**
     * Вычисление секториального момента инерции Iw [см6]
     */
    @Override
    public double calcSectorialMomentInertia(double tw, double h, double tf, double w1, double b, double w2) {
        iw = (tw * (h - tf) * Math.pow(w1, 2)) / 3
                + (2 * tf * (b - 0.5 * tw)) / 3 * (Math.pow(w1, 2)
                + Math.pow(w2, 2) - w1 * w2);
        return roundTwo(iw);
    }

    /**
     * Вычисление момента инерции при кручении It [см4]
     */
    @Override
    public double calcMomentInertiaTorsion(double b, double tf, double h, double tw) {
        it = (1.12 / 3) * (2 * (b * Math.pow(tf, 3))
                + (h - 2 * tf) * Math.pow(tw, 3));
        return roundTwo(it);
    }

    public static void main(String[] args) {
        BeamDialogUp beamDialogUp = new BeamDialogUp();
        System.out.println("ax: " + beamDialogUp.calcBendCenter(9.5, 0.6, 27, 1.05));
        System.out.println("w1: "
                + beamDialogUp.calcSectorialCoordinateW1(3.13, 27, 1.05));
        System.out.println("w2: "
                + beamDialogUp.calcSectorialCoordinateW2(9.5, 0.6, 3.13, 27, 1.05));
        System.out.println("Iw: "
                + beamDialogUp.calcSectorialMomentInertia(0.6, 27, 1.05, 40.6, 9.5, 78.77));
        System.out.println("It: "
                + beamDialogUp.calcMomentInertiaTorsion(9.5, 1.05, 27, 0.6));
        System.out.println("k: "
                + beamDialogUp.calcBendingTorsionalCharacteristic(10.22, 38533.26));
        System.out.println("Bmax1: " + beamDialogUp.calcBimomentMax1(2100, 8, 0.01008527, 600));
        System.out.println("Bmax1Displaced: "
                + beamDialogUp.calcBimomentMax1Displaced(2100, 8, 0.01008527, 600, 200));
    }
}
