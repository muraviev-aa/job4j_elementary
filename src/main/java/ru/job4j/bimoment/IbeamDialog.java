package ru.job4j.bimoment;

public class IbeamDialog implements SectionI {
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
     * Главная секториальная координата w1 [см2]
     */
    private double w1;
    /**
     * Секториальный момент инерции [см6]
     */
    private double iw;
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
     * Вычисление секториального момента инерции Iw [см6]
     */
    public double calcSectorialMomentInertia(double tf, double b, double h) {
        return roundTwo((tf * Math.pow(b, 3) * Math.pow((h - tf), 2)) / 24);
    }

    /**
     * Вычисление момента инерции при кручении It [см4]
     */
    public double calcMomentInertiaTorsion(double b, double tf, double h, double tw) {
        return roundTwo((1.29 / 3) * (2 * b * Math.pow(tf, 3) + (h - 2 * tf) * Math.pow(tw, 3)));
    }

    public static void main(String[] args) {
        IbeamDialog iBeam = new IbeamDialog();
        System.out.println("W: " + iBeam.calcSectorialCoordinateW1(20, 29.1));
        System.out.println("Iw: " + iBeam.calcSectorialMomentInertia(1.1, 20, 29.1));
        System.out.println("It: " + iBeam.calcMomentInertiaTorsion(20, 1.1, 29.1, 0.8));
        System.out.println("k: " + iBeam.calcBendingTorsionalCharacteristic(28.82, 287466.67));
        System.out.println("Bmax: " + iBeam.calcBimomentMax1(2100, 8, 0.0062006, 600));
    }
}
