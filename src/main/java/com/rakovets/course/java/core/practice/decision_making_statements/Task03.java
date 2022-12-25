package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от процентного соотношения максимального
 * количества HP и текущего.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    private static final double ZERO = 0.00;
    private static final double HIGH_LIMIT_RED_PERCENT = 0.25;
    private static final double HIGH_LIMIT_ORANGE_PERCENT = 0.50;
    private static final double HIGH_LIMIT_YELLOW_PERCENT = 0.75;
    private static final double HIGH_LIMIT_GREEN_PERCENT = 1.00;
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int currentHealthPoint = 50;
        int maxHealthPoint = 100;

        String colorHealthPoint = getColorHealthPoint(currentHealthPoint, maxHealthPoint);
        System.out.printf("Result: %s", colorHealthPoint);
    }

    /**
     * Возвращает цвет для шкалы HP игрока, в зависимости от процентного соотношения максимального количества HP и
     * текущего. Когда меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, меньше либо равно 100 -
     * зеленый.
     *
     * @param currentHealthPoint текущее количество HP игрока
     * @param maxHealthPoint     максимальное количество HP игрока
     * @return null/'RED'/'ORANGE'/'YELLOW'/'GREEN'
     */
    static String getColorHealthPoint(int currentHealthPoint, int maxHealthPoint) {
        String colorHP;
        double currentHealthPercent = 1.0f * currentHealthPoint / maxHealthPoint;
        if (currentHealthPercent <= HIGH_LIMIT_GREEN_PERCENT && currentHealthPercent >= HIGH_LIMIT_YELLOW_PERCENT) {
            colorHP = "GREEN";
        } else if (currentHealthPercent < HIGH_LIMIT_YELLOW_PERCENT && currentHealthPercent >= HIGH_LIMIT_ORANGE_PERCENT) {
            colorHP = "YELLOW";
        } else if (currentHealthPercent < HIGH_LIMIT_ORANGE_PERCENT && currentHealthPercent >= HIGH_LIMIT_RED_PERCENT) {
            colorHP = "ORANGE";
        } else if (currentHealthPercent < HIGH_LIMIT_RED_PERCENT && currentHealthPercent != ZERO) {
            colorHP = "RED";
        } else if (currentHealthPercent == ZERO) {
            colorHP = null;
        } else {
            colorHP = "PURPLE";
        }
        return colorHP;
    }
}
