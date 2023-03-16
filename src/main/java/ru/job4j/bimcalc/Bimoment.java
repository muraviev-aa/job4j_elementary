package ru.job4j.bimcalc;

public interface Bimoment {
    /**
     * Модуль сдвига [кг/см2]
     */
    double SHIFT = 805300.71;
    /**
     * Модуль упругости [кг/см2]
     */
    double ELASTIC = 2099898.06;

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

    /**
     * Вычисление изгибно-крутильной характеристики k [1/см]
     */
    default double calcBendingTorsionalCharacteristic(double it, double iw) {
        return roundEight(Math.sqrt((SHIFT * it) / (ELASTIC * iw)));
    }

    default double calcBimomentMax1(double p, double e, double k, double l) {
        return roundOne(((p * e) / (2 * k)) * (Math.sinh(0.5 * k * l) / Math.cosh(0.5 * k * l)));
    }

    default double calcBimomentMax1Displaced(double p, double e, double k, double l, double a) {
        return roundOne(((p * e) / k) * ((Math.sinh(k * a) * Math.sinh(k * (l - a))) / Math.sinh(k * l)));
    }

    default double calcMomentMax1(double p, double l) {
        return roundOne(0.25 * p * l);
    }

    default double calcMomentMax1Displaced(double p, double l, double a) {
        return roundOne((p * a * (l - a)) / l);
    }
}
