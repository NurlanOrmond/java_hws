package org.example.home_work_01;
import java.util.Random;

public class Task01 {
    // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    int getRandom(int bound, int start) {
        return new Random().nextInt(bound + 1 - start) - start;
    }

    //  2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    int fingMSB(int n) {
        return Integer.toBinaryString(n).length();
    }

    // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    int[] multiplesOfN(int min, int max, int dev) {
        int count1 = 0;
        for (int j = min; j <= max; j++) {
            if (j % dev == 0) {
                count1++;
            }
        }

        int[] array = new int[count1];
        for (int k = 0; k < array.length; k++) {
            for (int j = min; j <= max; j++) {
                if (j % dev == 0) {
                    array[k] = j;
                }
            }
        }
        return array;
    }

    // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    int[] notMultyplesOfN(int min, int max, int dev) {
        int count2 = 0;
        for (int j = min; j <= max; j++) {
            if (j % dev == 0) {
                count2++;
            }
        }

        int[] m2 = new int[count2];
        for (int k = 0; k < m2.length; k++) {
            for (int j = min; j <= max; j++) {
                if (j % dev != 0) {
                    m2[k] = j;
                }
            }
        }
        return m2;
    }


    public static void main(String[] args) {
        Random rnd = new Random();

        Task01 worker = new Task01();

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = worker.getRandom(2000, 0);
        System.out.println("Rrrrrandom number: " + i);

        //  2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = worker.fingMSB(i);
        System.out.println("Most significant bit place: " + n);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] m1 = worker.multiplesOfN(i, Short.MAX_VALUE, n);
        System.out.println("Sould be a zero: " + m1[rnd.nextInt(m1.length)] % n);

        int[] m2 = worker.notMultyplesOfN(Short.MIN_VALUE, i, n);
        System.out.println("Sould NOT be a zero: " + m2[rnd.nextInt(m1.length)] % n);
    }
}


