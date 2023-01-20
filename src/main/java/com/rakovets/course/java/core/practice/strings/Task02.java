package com.rakovets.course.java.core.practice.strings;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * Разработать программу для разбора (parsing) банковских отчетов.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        String bankReport = "typetypesetting 100$ -12$remaining the 1960s with -12$ the release -36$ of Letraset Lorem";

        double[] moneyFromReport = getArrayMoneyFromReport(bankReport);
        System.out.printf("Money from the report: %s\n", Arrays.toString(moneyFromReport));
        double sumMoneyFromReport = getSumMoneyFromReport(bankReport);
        System.out.printf("Sum money from the report: %s\n", sumMoneyFromReport);
    }

    /**
     * Возвращает список сумм, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return список сумм
     */
    static double[] getArrayMoneyFromReport(String report) {
        String stringMoney = report.replaceAll("[^-?\\d+(\\.\\d+$)?]", " ");
        double[] arrayMoney;
        int countIncluds = 0;
        if (report.indexOf('$') != -1) {
            int countDollar = report.length() - report.replace("$", "").length();
            arrayMoney = new double[countDollar];
            String[] stringArray = stringMoney.trim().split("\\s");
            for (int count = 0; count < stringArray.length; count++) {
                if (stringArray[count].indexOf('$') != -1) {
                    arrayMoney[countIncluds] = Double.parseDouble(stringArray[count].replace("$", ""));
                    countIncluds++;
                }
            }
        } else {
            arrayMoney = new double[]{};
        }
        return arrayMoney;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        double[] moneyFromReport = getArrayMoneyFromReport(report);
        double sum = 0;
        for (int count = 0; count < moneyFromReport.length; count++) {
            sum += moneyFromReport[count];
        }
        return BigDecimal.valueOf(sum).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
