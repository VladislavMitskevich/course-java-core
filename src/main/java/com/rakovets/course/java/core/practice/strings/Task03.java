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
        String informationAboutStuff = "Nappie Lopez-gomez    5000;" +
        "Crawford   Kelsey 2000;" +
                "Gregor    Samenfeld 4000;" +
                "Bendick Berti 3500     ;" +
                "Westleigh Aghayan   689," +
                "Maurits   Loreti 1200;" +
                "Thorvald Masson 2500;" +
                "Elijah   Simo 3450;" +
                "Shaun Nadal-ginard 1234;" +
                "Malvin Cambern 7654;" +
                "Northrup Berti 2345;" +
                "Laurence Aghayan 4632;";

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
        String[] informationToArray = renameSeparator(informationAboutStuff).split(";");
        String[] result = new String[informationToArray.length];

        for (int info = 0; info < informationToArray.length; info++) {
            result[info] = informationToArray[info].split("\\s+")[0];
        }

        return result;
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        String[] informationToArray = renameSeparator(informationAboutStuff).split(";");
        String[] result = new String[informationToArray.length];

        for (int info = 0; info < informationToArray.length; info++) {
            result[info] = informationToArray[info].split("\\s+")[1];
        }

        return result;
    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        String[] informationToArray = renameSeparator(informationAboutStuff).split(";");
        int[] result = new int[informationToArray.length];

        for (int info = 0; info < informationToArray.length; info++) {
            result[info] = Integer.parseInt(informationToArray[info].replace(";", "")
                    .split("\\s+")[2]);
        }

        return result;
    }

    static String renameSeparator (String informationAboutStuff) {
        return informationAboutStuff.replace(',',';');
    }
}
