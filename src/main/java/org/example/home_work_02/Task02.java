package org.example.home_work_02;
// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4",
// "предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task02 {
    public static void main(String[] args) {
        try {
            File myTxt = new File("Task2.txt");
            if (myTxt.createNewFile()) {
                System.out.println("File created: " + myTxt.getName());

            } else {
                System.out.println("The file is exist!");
            }
        } catch (IOException e) {
            System.out.println("We have an error");
            e.printStackTrace();
        }

        try {
            FileWriter myEdition = new FileWriter("Task2.txt");
            myEdition.write("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\"" +
                    ":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]");
            myEdition.close();
            System.out.println("Success!!!");
        } catch (IOException e) {
            System.out.println("We have a problem...");
            e.printStackTrace();
        }
    }
}
