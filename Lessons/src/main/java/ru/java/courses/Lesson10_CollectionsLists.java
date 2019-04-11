package ru.java.courses;

import java.util.*;

public class Lesson10_CollectionsLists {

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем список чисел
     * 2. Удаляем все дубли
     * 3. Преобразуем числа в строки
     * 4. Возращаем полученный список строк отсортированный по возрастанию
     * <p>
     * Подсказки:
     * Collections.sort() - сортировка
     * Удалять элементы из итерируемого списка нельзя - выпадет исключение
     */
    public static List<String> task1(List<Integer> source) {
        TreeSet<Integer> temp = new TreeSet<Integer>(source);
        List<String> stringList = new ArrayList<String>();
        for (Integer i : temp) {
            stringList.add(i.toString());
        }
        return stringList;
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем на входе массив чисел
     * 2. Преобразовываем его к списку
     * 4. Все четные числа увеличиваем на единицу
     * 5. Возвращаем кусок списка с 3-го по 7-й элемент
     * <p>
     * Подсказка: на входе может быть любое количество чисел
     */
    public static List<Integer> task2(Integer... array) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, list.get(i) + 1);
            }
        }
        if (list.size() < 9) {
            return list.subList(3, list.size());
        }
        return list.subList(3, 8);
    }
}