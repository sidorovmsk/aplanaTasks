package Classwork.Task3;

import java.util.Scanner;

public class Task3 {

    public static void numb(double x) {
        if (x > 0) {
            System.out.println(x * 2);
        }
        if (x < 0) {
            System.out.println(x + 1);
        } else if (x == 0)
            System.out.println("0");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numb(scanner.nextDouble());

    }
}
