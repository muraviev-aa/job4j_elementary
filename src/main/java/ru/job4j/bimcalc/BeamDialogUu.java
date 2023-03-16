package ru.job4j.bimcalc;

public class BeamDialogUu implements SectionU, Bimoment {
    /**
     * Расчет прокатного швеллера с уклоном полок
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
    private int h;
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
     * Момент инерции сечения относительно оси Х [см4]
     */
    double ix;
    /**
     * Момент сопротивления сечения относительно оси Х [см3]
     */
    double wx;
    /**
     * Упругая изгибно-крутильная характеристика [1/см]
     */
    private double k;
    /**
     * Максимальный бимомент [кг*см2]
     */
    private double bmax;

    /**
     * Определение толщины полки tf1
     */
    double calcFl1(double tf, double b) {
        return tf + 0.07 * 0.25 * b;
    }

    /**
     * Определение толщины полки tf2
     */
    double calcFl2(double tf, double b) {
        return tf - 0.07 * 0.5 * b;
    }

    /**
     * Определение высоты сечения h1
     */
    double calcH1(double h, double tf, double b) {
        return h - (tf + 0.07 * 0.25 * b);
    }

    /**
     * Определение высоты сечения h2
     */
    double calcH2(double h, double tf) {
        return h - 2 * tf;
    }

    /**
     * Определение высоты сечения h3
     */
    double calcH3(double h, double tf, double b) {
        return h - (tf - 0.07 * 0.5 * b);
    }

    /**
     * Вычисление координаты центра изгиба ax [см]
     */
    double calcBendCenter(double b, double tw, double h, double tf, double ix) {
        double a = (Math.pow(b - 0.5 * tw, 2) * (h - (tf + 0.07 * 0.25 * b))) / (24 * ix);
        double c = 2 * tf - 0.05 * tw;
        double d = 2 * (h - (tf - 0.07 * 0.5 * b)) + (h - (tf + 0.07 * 0.25 * b));
        double e = 0.1 * (b - 0.5 * tw) * (h - (tf - 0.07 * 0.5 * b));
        return roundTwo(a * (c * d - e));
    }

    /**
     * Вычисление секториальной координаты W1 [см2]
     */
    double calcSectorialCoordinateW1(double ax, double h, double tf, double b) {
        return roundTwo(0.5 * ax * (h - (tf + 0.07 * 0.25 * b)));
    }

    /**
     * Вычисление секториальной координаты W2 [см2]
     */
    @Override
    public double calcSectorialCoordinateW2(double h, double tf, double b, double tw, double ax) {
        return roundTwo(0.5 * (h - (tf + 0.07 * 0.25 * b)) * ((b - 0.5 * tw) - ax)
                - 0.5 * 0.07 * (b - 0.5 * tw) * ax);
    }

    /**
     * Вычисление секториального момента инерции Iw [см6]
     */
    @Override
    public double calcSectorialMomentInertia(double tw, double h, double tf, double b, double w1, double w2) {
        double a = (tw * (h - (tf + 0.07 * 0.25 * b)) * Math.pow(w1, 2)) / 3;
        double c = ((2 * tf * (b - 0.5 * tw)) / 3) * (Math.pow(w1, 2) + Math.pow(w2, 2) - w1 * w2);
        double d = ((0.07 * Math.pow((b - 0.5 * tw), 2)) / 6) * (Math.pow(w2, 2) - Math.pow(w1, 2));
        return roundTwo(a + c - d);
    }

    /**
     * Вычисление момента инерции при кручении It [см4]
     */
    @Override
    public double calcMomentInertiaTorsion(double b, double tf, double h, double tw) {
        return roundTwo((1.12 / 3) * (2 * b * Math.pow(tf, 3) + (h - 2 * tf) * Math.pow(tw, 3)));
    }

    public static void main(String[] args) {
        BeamDialogUu beamDialogUu = new BeamDialogUu();
        System.out.println("ax: "
                + beamDialogUu.calcBendCenter(9.5, 0.6, 27, 1.05, 4160));
        System.out.println("w1: "
                + beamDialogUu.calcSectorialCoordinateW1(3.02, 27, 1.05, 9.5));
        System.out.println("w2: "
                + beamDialogUu.calcSectorialCoordinateW2(27, 1.05, 9.5, 0.6, 3.02));
        System.out.println("Iw: "
                + beamDialogUu.calcSectorialMomentInertia(0.6, 27, 1.05, 9.5, 38.94, 78.7));
        System.out.println("It: " + beamDialogUu.calcMomentInertiaTorsion(9.5, 1.05, 27, 0.6));
        System.out.println("k: " + beamDialogUu.calcBendingTorsionalCharacteristic(10.22, 33117.17));
        System.out.println("Bmax: " + beamDialogUu.calcBimomentMax1(2100, 8, 0.01087875, 600));
    }
}
