package org.example.home_work_02;
// *Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов
// средствами String и StringBuilder.

import java.nio.charset.Charset;
import java.util.Random;
import java.util.stream.Collectors;

public class Task03 {
    public static String getText(int n) {
        String chars = "abcdefghigkmlnopqrstuvwxyz";
        Random rnd = new Random();
        String txt = rnd.ints(n, 0, chars.length())
                .mapToObj(i -> "" + chars.charAt(i))
                .collect(Collectors.joining());;
        return txt;
    }

    public static void stringTime (String str) {
        long start = System.currentTimeMillis();
        str = str.replace('a', 'A');
        System.out.println("String takes: " + (System.currentTimeMillis() - start));
    }
    public static void builderTime (String str) {
        StringBuilder sb = new StringBuilder(str);
        long start = System.currentTimeMillis();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.setCharAt(i, 'A');
            }
        }
        System.out.println("String Builder takes: " + (System.currentTimeMillis() - start));

    }


   public static void main(String[] args) {
        String s = getText(2000000);

        stringTime(s);
        builderTime(s);






    }
}
