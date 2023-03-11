package ru.job4j.bimoment;

public class Ubeam implements Section {
    /**
     * Толщина полки [см]
     */
    private double tf = 1.05;
    /**
     * Ширина полки [см]
     */
    private double b = 9.5;
    /**
     * Толщина стенки [см]
     */
    private double tw = 0.6;
    /**
     * Высота сечения [см]
     */
    private int h = 27;
    /**
     * Сосредоточенная сила [кг]
     */
    private double p = 2100;
    /**
     * Эксцентриситет [см]
     */
    private double e = 8;
    /**
     * Пролет балки [см]
     */
    private double l = 600;
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

    double roundTwo(double d) {
        double scale = Math.pow(10, 2);
        return Math.ceil(d * scale) / scale;
    }

    double roundEight(double d) {
        double scale = Math.pow(10, 8);
        return Math.ceil(d * scale) / scale;
    }

    @Override
    public double calcBendCenter() {
        ax = 3 * Math.pow((b - 0.5 * tw), 2) / ((h - tf)
                + 6 * (b - 0.5 * tw));
        return roundTwo(ax);
    }

    @Override
    public double calcSectorialCoordinateW1() {
        w1 = ax * 0.5 * (h - tf);
        return roundTwo(w1);
    }

    @Override
    public double calcSectorialCoordinateW2() {
        w2 = ((b - 0.5 * tw) - ax) * 0.5 * (h - tf);
        return roundTwo(w2);
    }

    @Override
    public double calcSectorialMomentInertia() {
        iw = (tw * (h - tf) * Math.pow(w1, 2)) / 3
                + (2 * tf * (b - 0.5 * tw)) / 3 * (Math.pow(w1, 2)
                + Math.pow(w2, 2) - w1 * w2);
        return roundTwo(iw);
    }

    @Override
    public double calcMomentInertiaTorsion() {
        it = (1.12 / 3) * (2 * (b * Math.pow(tf, 3))
                + (h - 2 * tf) * Math.pow(tw, 3));
        return roundTwo(it);
    }

    @Override
    public double calcBendingTorsionalCharacteristic() {
        k = Math.sqrt((SHIFT * it) / (ELASTIC * iw));
        return roundEight(k);
    }

    @Override
    public double calcBimomentMax() {
        bmax = ((p * e) / (2 * k)) * (Math.sinh(0.5 * k * l) / Math.cosh(0.5 * k * l));
        return roundOne(bmax);
    }

    public static void main(String[] args) {
        Ubeam ubeam = new Ubeam();
        System.out.println("ax " + ubeam.calcBendCenter());
        System.out.println("w1 " + ubeam.calcSectorialCoordinateW1());
        System.out.println("w2 " + ubeam.calcSectorialCoordinateW2());
        System.out.println("Iw " + ubeam.calcSectorialMomentInertia());
        System.out.println("It " + ubeam.calcMomentInertiaTorsion());
        System.out.println("k " + ubeam.calcBendingTorsionalCharacteristic());
        System.out.println("Bmax " + ubeam.calcBimomentMax());
    }
}
