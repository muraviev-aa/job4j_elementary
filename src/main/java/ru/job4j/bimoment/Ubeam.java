package ru.job4j.bimoment;

public class Ubeam implements Section {
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
     * Упругая изгибно-крутильная характеристика [1/см]
     */
    private double k;
    /**
     * Максимальный бимомент [кг/см2]
     */
    private double bmax;

    /**
     * Округление промежуточных значений вычислений
     */
    double roundOne(double d) {
        double scale = Math.pow(10, 1);
        return Math.ceil(d * scale) / scale;
    }

    static double roundTwo(double d) {
        double scale = Math.pow(10, 2);
        return Math.ceil(d * scale) / scale;
    }

    double roundEight(double d) {
        double scale = Math.pow(10, 8);
        return Math.ceil(d * scale) / scale;
    }

    @Override
    public double calcBendCenter(double b, double tw, int h, double tf) {
        ax = 3 * Math.pow((b - 0.5 * tw), 2) / ((h - tf)
                + 6 * (b - 0.5 * tw));
        return roundTwo(ax);
    }

    @Override
    public double calcSectorialCoordinateW1(double ax, int h, double tf) {
        w1 = ax * 0.5 * (h - tf);
        return roundTwo(w1);
    }

    @Override
    public double calcSectorialCoordinateW2(double b, double tw, double ax, int h, double tf) {
        w2 = ((b - 0.5 * tw) - ax) * 0.5 * (h - tf);
        return roundTwo(w2);
    }

    @Override
    public double calcSectorialMomentInertia(double tw, int h, double tf, double w1, double b, double w2) {
        iw = (tw * (h - tf) * Math.pow(w1, 2)) / 3
                + (2 * tf * (b - 0.5 * tw)) / 3 * (Math.pow(w1, 2)
                + Math.pow(w2, 2) - w1 * w2);
        return roundTwo(iw);
    }

    @Override
    public double calcMomentInertiaTorsion(double b, double tf, int h, double tw) {
        it = (1.12 / 3) * (2 * (b * Math.pow(tf, 3))
                + (h - 2 * tf) * Math.pow(tw, 3));
        return roundTwo(it);
    }

    @Override
    public double calcBendingTorsionalCharacteristic(double it, double iw) {
        k = Math.sqrt((SHIFT * it) / (ELASTIC * iw));
        return roundEight(k);
    }

    @Override
    public double calcBimomentMax1(double p, double e, double k, double l) {
        bmax = ((p * e) / (2 * k)) * (Math.sinh(0.5 * k * l) / Math.cosh(0.5 * k * l));
        return roundOne(bmax);
    }

    public static void main(String[] args) {
        Ubeam ubeam = new Ubeam();
        System.out.println("ax " + ubeam.calcBendCenter(9.5, 0.6, 27, 1.05));
        System.out.println("w1 " + ubeam.calcSectorialCoordinateW1(3.13, 27, 1.05));
        System.out.println("w2 " + ubeam.calcSectorialCoordinateW2(9.5, 0.6, 3.13, 27, 1.05));
        System.out.println("Iw "
                + ubeam.calcSectorialMomentInertia(0.6, 27, 1.05, 40.62, 9.5, 78.76));
        System.out.println("It " + ubeam.calcMomentInertiaTorsion(9.5, 1.05, 27, 0.6));
        System.out.println("k " + ubeam.calcBendingTorsionalCharacteristic(10.22, 38534.48));
        System.out.println("Bmax " + ubeam.calcBimomentMax1(2100, 8, 0.01008511, 600));
    }
}
