package Homework.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива(чётное число):");
        int[] ints = new int[scanner.nextInt()];
        int[] ints1;
        int[] ints2;
        int sum1 = 0;
        int sum2 = 0;

        if (ints.length % 2 == 0) {
            System.out.println("Заполните массив:");
            for (int i = 0; i < ints.length; i++) {
                ints[i] = scanner.nextInt();
            }
            ints1 = new int[ints.length / 2];
            ints2 = new int[ints.length / 2];
            for (int i = 0; i < ints.length / 2; i++) {
                sum1 += ints[i];
                ints1[i] = ints[i];
            }
            for (int i = ints.length / 2; i < ints.length; i++) {
                sum2 += ints[i];
                ints2[i - ints.length / 2] = ints[i];
            }
            if (sum1 == sum2) {
                for (int i = 0; i < ints.length / 2; i++) {
                    System.out.print(ints1[i] + " ");
                }
                System.out.println("- массив 1");
                for (int i = 0; i < ints.length / 2; i++) {
                    System.out.print(ints2[i] + " ");
                }
                System.out.println("- массив 2");
            }
            System.out.println(sum1 + " - сумма первого массива ");
            System.out.println(sum2 + " - сумма второго массива ");
        }
    }
}