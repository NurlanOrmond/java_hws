package org.example.home_work_02;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Task02_1 {

    public static String readContent (String path, Charset code) throws IOException {
        List <String> content = Files.readAllLines(Path.of(path));
        return String.join(System.lineSeparator(), content);
    }

    public static StringBuilder clearChars(StringBuilder s, char smbl) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == smbl) {
                s.deleteCharAt(i);
            }
        }
        return s;
    }

    public static StringBuilder replaceToSpace (StringBuilder s, char smbl) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == smbl) {
                s.setCharAt(i, ' ');
            }
        }
        return s;
    }


    public static void main(String[] args) {
        String path = "C:\\Users\\NURLAN\\java_hws\\java_hws\\Task2.txt";
        String txt = "";
        try {
            txt = readContent(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(txt);

        StringBuilder s = new StringBuilder(txt);

        clearChars(s, '{');
        //clearChars(s, '}');
        clearChars(s, '[');
        clearChars(s, ']');
        clearChars(s, '"');

        replaceToSpace(s, ':');
        replaceToSpace(s, ',');

        //System.out.println(s);

        String s1 = s.toString().replace("фамилия", "Студент");
        String s2 = s1.replace("оценка", "получил");
        String s3 = s2.replace("предмет", "по предмету");

        System.out.println();

        String[] lines = s3.split("}");
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i].trim().concat("."));
        }















    }
}
