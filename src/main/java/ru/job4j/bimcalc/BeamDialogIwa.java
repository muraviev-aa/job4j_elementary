package ru.job4j.bimcalc;

public class BeamDialogIwa implements Bimoment, SectionI {
    /**
     * Расчет сварного двутавра, сечение симметрично относительно одной оси
     */
    /**
     * Толщина верхней полки [см]
     */
    private double tf1;
    /**
     * Толщина нижней полки [см]
     */
    private double tf2;
    /**
     * Ширина верхней полки [см]
     */
    private double b;
    /**
     * Ширина нижней полки [см]
     */
    private double d;
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
     * по оси OY от середины верхней полки
     */
    private double ay;
    /**
     * Главная секториальная координата w1 [см2]
     */
    private double w1;
    /**
     * Главная секториальная координата w2 [см2]
     */
    private double w2;
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
     * Вычисление координаты центра изгиба ay [см]
     * по оси OY от середины верхней полки
     */
    public double calcBendCenter(double b, double h, double tf1, double tf2, double d) {
        return roundTwo((tf2 * Math.pow(d, 3) * (h - 0.5 * (tf1 + tf2)))
                / (tf1 * Math.pow(b, 3) + tf2 * Math.pow(d, 3)));
    }

    /**
     * Вычисление секториальной координаты W1 [см2]
     */
    @Override
    public double calcSectorialCoordinateW1(double b, double ay) {
        return roundTwo(0.5 * b * ay);
    }

    /**
     * Вычисление секториальной координаты W2 [см2]
     */
    public double calcSectorialCoordinateW2(double d, double ay, double h, double tf1, double tf2) {
        return roundTwo(0.5 * (((h - 0.5 * (tf1 + tf2)) - ay) * d));
    }

    /**
     * Вычисление секториального момента инерции Iw [см6]
     */
    public double calcSectorialMomentInertia(double tf1, double tf2, double b, double d, double h) {
        return roundTwo((tf1 * Math.pow(b, 3) * tf2 * Math.pow(d, 3)
                * Math.pow((h - 0.5 * (tf1 + tf2)), 2))
                / (12 * (tf1 * Math.pow(b, 3) + tf2 * Math.pow(d, 3))));
    }

    /**
     * Вычисление момента инерции при кручении It [см4]
     */
    public double calcMomentInertiaTorsion(double b, double tf1, double d, double tf2, double h, double tw) {
        return roundTwo((1.25 / 3) * (b * Math.pow(tf1, 3) + d * Math.pow(tf2, 3)
                + ((h - tf1 - tf2) * Math.pow(tw, 3))));
    }

    public static void main(String[] args) {
        BeamDialogIwa beamDialogIwa = new BeamDialogIwa();
        System.out.println("ay: "
                + beamDialogIwa.calcBendCenter(40, 66.6, 1.6, 1, 25));
        System.out.println("w1: "
                + beamDialogIwa.calcSectorialCoordinateW1(40, 8.65));
        System.out.println("w2: "
                + beamDialogIwa.calcSectorialCoordinateW2(25, 8.65, 66.6, 1.6, 1));
        System.out.println("Iw: "
                + beamDialogIwa.calcSectorialMomentInertia(1.6, 1, 40, 25, 66.6));
        System.out.println("It: "
                + beamDialogIwa.calcMomentInertiaTorsion(40, 1.6, 25, 1, 66.6, 0.8));
        System.out.println("k: "
                + beamDialogIwa.calcBendingTorsionalCharacteristic(92.34, 4817160.21));
        System.out.println("Bmax: "
                + beamDialogIwa.calcBimomentMax1(2100, 8, 0.00271132, 600));
    }
}
