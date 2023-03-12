package ru.job4j.bimoment;

public interface SectionU {
    /**
     * Модуль сдвига [кг/см2]
     */
    double SHIFT = 805300.71;
    /**
     * Модуль упругости [кг/см2]
     */
    double ELASTIC = 2099898.06;
    /**
     * Вычисление координаты центра изгиба ax [см]
     */
    double calcBendCenter(double b, double tw, int h, double tf);

    /**
     * Вычисление секториальной координаты W1 [см2]
     */
    double calcSectorialCoordinateW1(double ax, int h, double tf);

    /**
     * Вычисление секториальной координаты W2 [см2]
     */
    double calcSectorialCoordinateW2(double b, double tw, double ax, int h, double tf);

    /**
     * Вычисление секториального момента инерции Iw [см6]
     */
    double calcSectorialMomentInertia(double tw, int h, double tf, double w1, double b, double w2);

    /**
     * Вычисление момента инерции при кручении It [см4]
     */
    double calcMomentInertiaTorsion(double b, double tf, int h, double tw);

    /**
     * Вычисление изгибно-крутильной характеристики k [1/см]
     */
    double calcBendingTorsionalCharacteristic(double it, double iw);
    
    /**
     * Вычисление максимального бимомента Bmax [кг/см2]
     * расчетная схема №1
     */
    double calcBimomentMax1(double p, double e, double k, double l);

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
