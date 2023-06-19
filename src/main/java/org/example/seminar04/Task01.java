package org.example.seminar04;

import java.util.*;

public class Task01 {

    public static ArrayList <String> sortedByAge (ArrayList<String> str) {
        ArrayList<String> sorted = new ArrayList<>();
        // Извлекаю возраст:
        int [] age = new int [str.size()];
        for (int i = 0; i < str.size(); i++) {
            String[] line = str.get(i).split(" ");
            age [i] = (Integer.parseInt(line[3]));

        }
        // Сортирую возвраст:
        int [] sortedAge = Arrays.stream(age).sorted().toArray();

        // Сравниваю возвраст с отсортированным и создаю новый ArrayList по шаблону sortedAge:
        for (int k : sortedAge) {
            for (int j = 0; j < age.length; j++) {
                if (k == age[j]) {
                    sorted.add(str.get(j));
                }
            }
        }
        return sorted;
    }

    public static ArrayList <String> sortedBySex (ArrayList<String> str, String sex) {
        ArrayList<String> sorted = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).endsWith(sex)) {
                sorted.add(str.get(i));
            }
        }
        return sortedByAge(sorted);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        boolean inInput = false;
        System.out.println("Введите Фамилию Имя Отчество возраст пол (муж/жен) \nНажмите клавишу пробел как завешите ввод данных");
        while (!inInput) {
            String data = scnr.nextLine();
            if (data.equals(" ")) {
                inInput = true;

            } else {
                list.add(data);
            }
        }


        System.out.println("-----------------------------------");


        boolean inGame = false;
        while (!inGame) {
            System.out.print("\n\nНажмите 1 для просмотра списка \nНажмите 2 для сортировки по возрасту \nНажмите 3 для сортировки по женскому полу и возврасту \nНажмите 4 сортировки по мужскому полу и возрасту \nНажмите 0 для выхода \nВаш выбор: \n\n");
            int choose = scnr.nextInt();

            switch (choose) {
                case 1 -> list.forEach(System.out::println);
                case 2 -> sortedByAge(list).forEach(System.out::println);
                case 3 -> sortedBySex(list, "жен").forEach(System.out::println);
                case 4 -> sortedBySex(list, "муж").forEach(System.out::println);
                default -> inGame = true;
            }
        }

    }

}
