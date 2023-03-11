package ru.job4j.bimoment;

public interface Section {
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
    double calcBendCenter();

    /**
     * Вычисление секториальной координаты W1 [см2]
     */
    double calcSectorialCoordinateW1();

    /**
     * Вычисление секториальной координаты W2 [см2]
     */
    double calcSectorialCoordinateW2();

    /**
     * Вычисление секториального момента инерции Iw [см6]
     */
    double calcSectorialMomentInertia();

    /**
     * Вычисление момента инерции при кручении It [см4]
     */
    double calcMomentInertiaTorsion();

    /**
     * Вычисление изгибно-крутильной характеристики k [1/см]
     */
    double calcBendingTorsionalCharacteristic();
    /**
     * Вычисление максимального бимомента Bmax [кг/см2]
     * расчетная схема №1
     */

    double calcBimomentMax();
}
