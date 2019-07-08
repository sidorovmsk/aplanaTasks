package Homework.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4 {

    private static int[] set(int[] one, int[] two) {
        int[] ret = new int[one.length];
        for (int i = 0; i < one.length; i++) {
            ret[i] = one[i] + two[i];
        }
        return ret;
    }

    private static void get(ArrayList<Integer> integerArrayList) {
        for (Integer integer : integerArrayList) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] ints1 = new int[size];
        int[] ints2 = new int[size];

        System.out.println("Заполните первый массив:");
        for (int i = 0; i < size; i++) {
            ints1[i] = scanner.nextInt();
        }
        System.out.println("Заполните второй массив:");
        for (int i = 0; i < size; i++) {
            ints2[i] = scanner.nextInt();
        }

        int[] res = (set(ints1, ints2)); // суммированный массив
        double d = (double) res.length / 2;
        double ddd = Math.ceil(d); // середина или чуть больше при нечетном массиве
        int med = (int) ddd;
        int[] f = new int[med];

        for (int i = 0; i < med; i++) { // заполнение массива суммами середин двух массивов
            f[i] = res[med / 2 + i];
        }

        for (int value : f) {
            arrayList.add(value);
        }
        Collections.shuffle(arrayList); // перемешивание
        get(arrayList);
    }
}