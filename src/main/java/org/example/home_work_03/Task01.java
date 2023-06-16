package org.example.home_work_03;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Пусть дан произвольный список целых чисел.
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10));
        }

        // Нужно удалить из него чётные числа
        list.removeIf(integer -> integer % 2 == 0);

        System.out.println(list);

        // Найти минимальное значение
        System.out.println(
                list.stream().mapToInt(value -> value).min()
        );

        // Найти максимальное значение
        System.out.println(
                list.stream().mapToInt(value -> value).max()
        );

        // Найти среднее значение
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        double average = sum/list.size();
        System.out.println(average);

    }

}


