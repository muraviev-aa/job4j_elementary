package ru.job4j.bimoment;

public interface SectionI {
    /**
     * Модуль сдвига [кг/см2]
     */
    double SHIFT = 805300.71;
    /**
     * Модуль упругости [кг/см2]
     */
    double ELASTIC = 2099898.06;

    /**
     * Вычисление секториальной координаты W1 [см2]
     */
    default double calcSectorialCoordinateW1(double b, double h) {
        return roundTwo(0.25 * b * h);
    }

    /**
     * Вычисление секториального момента инерции Iw [см6]
     */
    default double calcSectorialMomentInertia(double tf, double b, double h) {
        return roundTwo((tf * Math.pow(b, 3) * Math.pow((h - tf), 2)) / 24);
    }

    /**
     * Вычисление момента инерции при кручении It [см4]
     */
    default double calcMomentInertiaTorsion(double b, double tf, double h, double tw) {
        return roundTwo((1.29 / 3) * (2 * b * Math.pow(tf, 3) + (h - 2 * tf) * Math.pow(tw, 3)));
    }

    /**
     * Вычисление изгибно-крутильной характеристики k [1/см]
     */
    default double calcBendingTorsionalCharacteristic(double it, double iw) {
        return roundEight(Math.sqrt((SHIFT * it) / (ELASTIC * iw)));
    }

    /**
     * Вычисление максимального бимомента Bmax [кг/см2]
     * расчетная схема №1
     */
    default double calcBimomentMax1(double p, double e, double k, double l) {
        return roundOne(((p * e) / (2 * k)) * (Math.sinh(0.5 * k * l) / Math.cosh(0.5 * k * l)));
    }

    /**
     * Округление промежуточных значений вычислений
     */
    default double roundOne(double d) {
        double scale = Math.pow(10, 1);
        return Math.ceil(d * scale) / scale;
    }

    default double roundTwo(double d) {
        double scale = Math.pow(10, 2);
        return Math.ceil(d * scale) / scale;
    }

    default double roundEight(double d) {
        double scale = Math.pow(10, 8);
        return Math.ceil(d * scale) / scale;
    }
}
