package com.rakovets.course.java.core.practice.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}
        };

        double[] averageMark = getAverageMarks(marks);
        System.out.printf("Average mark: %s\n", Arrays.toString(averageMark));
        int[] minMark = getMinMarks(marks);
        System.out.printf("Min mark: %s\n", Arrays.toString(minMark));
        int[] maxMark = getMaxMarks(marks);
        System.out.printf("Max mark: %s\n", Arrays.toString(maxMark));
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMarks(int[][] marks) {
        double[] averegeMarks = new double[marks.length];
        for (int line = 0; line < marks.length; line++) {
            double averegeMark = 0;
            int sum = 0;
            int count = 0;
            for (int column = 0; column < marks[line].length; column++) {
                sum = sum + marks[line][column];
                count++;
                averegeMark = BigDecimal.valueOf((double) sum / count).setScale(2, RoundingMode.HALF_UP).doubleValue();
            }
            averegeMarks[line] = averegeMark;
        }
        return averegeMarks;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minMarks = new int[marks.length];
        int minMark;
        for (int line = 0; line < marks.length; line++) {
            minMark = marks[line][0];
            for (int column = 0; column < marks[line].length; column++) {
                if (minMark > marks[line][column]) {
                    minMark =  marks[line][column];
                }
            }
            minMarks[line] = minMark;
        }
        return minMarks;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxMarks = new int[marks.length];
        for (int line = 0; line < marks.length; line++) {
            int maxMark = 0;
            for (int column = 0; column < marks[line].length; column++) {
                if (maxMark < marks[line][column]) {
                    maxMark =  marks[line][column];
                }
            }
            maxMarks[line] = maxMark;
        }
        return maxMarks;
    }
}
