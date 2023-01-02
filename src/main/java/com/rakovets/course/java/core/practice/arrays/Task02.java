package com.rakovets.course.java.core.practice.arrays;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {{5, 4, 5}, {4, 9, 4}, {9, 4, 5}};

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }

    /**
     * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[][] marks) {
        int sum = 0;
        int count=0;
        for (int line = 0; line < marks.length; line++) {
            for (int column = 0; column < marks[line].length; column++) {
                sum += marks[line][column];
                count++;
                }
            }
        double c = (double) sum/count;
        String output = String.format("%.2f", c);
        return output;
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        int minMarks = marks[0][0];
        for (int line = 0; line < marks.length; line++) {
            for (int column = 0; column < marks[line].length; column++) {
                if (minMarks > marks[line][column]) {
                    minMarks =  marks[line][column];
                }
            }
        }
        return minMarks;
    }

    /**
     * Возвращает максимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        int maxMarks = 0;
        for (int line = 0; line < marks.length; line++) {
            for (int column = 0; column < marks[line].length; column++) {
                if (maxMarks < marks[line][column]) {
                    maxMarks =  marks[line][column];
                }
            }
        }
        return maxMarks;
    }
}
