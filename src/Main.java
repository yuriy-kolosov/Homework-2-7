import java.util.*;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 2-7. Коллекции. Сеты и мапы");
        System.out.println();

        System.out.println("            Задача 1. Тест 1");
        System.out.println();

        List<Integer> nums11 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("                      Исходный список чисел:");
        System.out.println(nums11);
        System.out.println("                      Результат (только нечетные):");

        task1(nums11);
        System.out.println();
        System.out.println();

        System.out.println("            Задача 1. Тест 2");
        System.out.println();

        List<Integer> nums12 = new ArrayList<>(List.of(99, -71, -73, 0, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("                      Исходный список чисел:");
        System.out.println(nums12);
        System.out.println("                      Результат (только нечетные):");

        task1(nums12);
        System.out.println();
        System.out.println();

        System.out.println("            Задача 2. Тест 1");
        System.out.println();

        List<Integer> nums21 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("                      Исходный список чисел:");
        System.out.println(nums21);
        System.out.println("                      Результат (только четные в порядке возрастания без повторов):");

        task2(nums21);
        System.out.println();

        System.out.println("            Задача 2. Тест 2");
        System.out.println();

        List<Integer> nums22 = new ArrayList<>(List.of(-52, 53, -22, 0, 100, 24, 23, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("                      Исходный список чисел:");
        System.out.println(nums22);
        System.out.println("                      Результат (только четные в порядке возрастания без повторов):");

        task2(nums22);
        System.out.println();

        System.out.println("            Задача 3. Тест 1");
        System.out.println();

        List<String> strings31 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println("                      Исходный список слов:");
        System.out.println(strings31);
        System.out.println("                      Результат (уникальные слова без повторов в произвольном порядке):");

        task3(strings31);
        System.out.println();

        System.out.println("            Задача 3. Тест 2");
        System.out.println();

        List<String> strings32 = new ArrayList<>(List.of("любая", "последовательность", "любая", "любая", "и", "объём", "и", "объём", "слов", "списка"));
        System.out.println("                      Исходный список слов:");
        System.out.println(strings32);
        System.out.println("                      Результат (уникальные слова без повторов в произвольном порядке):");

        task3(strings32);
        System.out.println();

        System.out.println("            Задача 4. Тест 1");
        System.out.println();

        List<String> strings41 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println("                      Исходный список слов:");
        System.out.println(strings41);
        System.out.println("                      Результат (число повторов уникальных слов):");

        task4(strings41);
        System.out.println();

        System.out.println("            Задача 4. Тест 2");
        System.out.println();

        List<String> strings42 = new ArrayList<>(List.of("любая", "последовательность", "любая", "любая", "и", "объём", "и", "объём", "слов", "списка"));
        System.out.println("                      Исходный список слов:");
        System.out.println(strings42);
        System.out.println("                      Результат (число повторов уникальных слов):");

        task4(strings42);

    }

    public static void task1(List<Integer> inputNums) {

        for (int iN : inputNums) {
            if (iN % 2 != 0) {
                System.out.print(" " + iN);
            }
        }
    }

    public static void task2(List<Integer> inputNums) {

        Collections.sort(inputNums);

        int prev = inputNums.get(0);
        int next;
        for (int i = 0; i < inputNums.size(); i++) {
            next = inputNums.get(i);
            if ((i == 0) && (prev % 2 == 0)) {
                System.out.print(" " + prev);
            } else if ((prev < next) && (next % 2 == 0)) {
                System.out.print(" " + next);
                prev = next;
            }
        }
        System.out.println();

    }

    public static void task3(List<String> inputString) {

        Set<String> sString = new HashSet<>(inputString);
        System.out.println(sString);

    }

    public static void task4(List<String> inputString) {

        Object[] arrayString = inputString.toArray();

        for (int i = 0, repNum = 1; i < arrayString.length; i++) {

            if (arrayString[i] != null) {

                for (int j = i + 1; j < arrayString.length; j++) {

                    if (arrayString[j] != null && arrayString[i].equals(arrayString[j])) {
                        arrayString[j] = null;
                        repNum++;
                    }
                }
                System.out.println(repNum);
                arrayString[i] = null;
                repNum = 1;
            }
        }

    }

}