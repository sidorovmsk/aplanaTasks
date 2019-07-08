package Classwork.Task1;

import java.util.Scanner;

public class Task1 {

    // ближайшее к 10 из двух чисел
    public static void first10(double a, double b) {
        double x = abs(a - 10);
        double z = abs(b - 10);
        if (x == z) {
            System.out.println(a);
        }
        if (x > z) {
            System.out.println(b);
        }
        if (x < z) {
            System.out.println(a);
        }
    }

    public static double abs(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double one = scanner.nextDouble();
        double two = scanner.nextDouble();

        first10(one, two);
    }

}
