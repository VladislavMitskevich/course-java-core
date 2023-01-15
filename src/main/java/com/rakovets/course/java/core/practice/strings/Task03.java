package com.rakovets.course.java.core.practice.strings;

import com.rakovets.course.java.core.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для разбора (parsing) информации о персонале компании.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task03 extends StandardInputTask {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        //String informationAboutStuff = INPUT_SCANNER.nextLine();
        String informationAboutStuff = "Ivan Ivanov 11200$, Pet 1500$ Petrov ";

        String[] names = parseToArrayName(informationAboutStuff);
        System.out.printf("Names: %s\n", Arrays.toString(names));
        String[] surnames = parseToArraySurname(informationAboutStuff);
        System.out.printf("Surnames: %s\n", Arrays.toString(surnames));
        int[] salaries = parseToArraySalary(informationAboutStuff);
        System.out.printf("Salaries: %s\n", Arrays.toString(salaries));
    }

    /**
     * Возвращает массив имен персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив имен персонала, где каждый элемент является именем одного сотрудника
     */
    static String[] parseToArrayName(String informationAboutStuff) {
        String[] arrayText = getTextWithoutMoney(informationAboutStuff);
        System.out.println(Arrays.toString(arrayText));
        System.out.println(arrayText.length);
        String[] arrayName = new String[arrayText.length / 2];
        int i = 0;
        for (int count = 0; count < arrayText.length; count += 2) {
            arrayName[i] = arrayText[count];
            i += 1;
        }
        return arrayName;
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        return null;
    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        String stringMoney = informationAboutStuff.replaceAll("[^-?\\d+$?]", "");
        String[] arrayStringMoney = stringMoney.split("\\$");
        int[] arrayMoney = new int[arrayStringMoney.length];
        for (int i = 0; i < arrayStringMoney.length; i++) {
            arrayMoney[i] = Integer.parseInt(arrayStringMoney[i]);
        }
        return arrayMoney;
    }

    static String[] getTextWithoutMoney(String informationAboutStuff) {
        String stringWithoutMoney = informationAboutStuff
                .replaceAll("[-?\\d+$,.?]", "")
                .replaceAll("  ", " ");
        String[] arrayStringWithoutMoney = stringWithoutMoney.split(" ");
        return arrayStringWithoutMoney;
    }
}
