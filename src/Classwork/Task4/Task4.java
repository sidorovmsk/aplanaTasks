package Classwork.Task4;

import java.util.Scanner;

public class Task4 {

    public static void tabl(int d) {
        int x = d / d;
        System.out.println(d + " * " + x + " = " + d * x);
        System.out.println(d + " * " + ++x + " = " + d * x);
        System.out.println(d + " * " + ++x + " = " + d * x);
        System.out.println(d + " * " + ++x + " = " + d * x);
        System.out.println(d + " * " + ++x + " = " + d * x);
        System.out.println(d + " * " + ++x + " = " + d * x);
        System.out.println(d + " * " + ++x + " = " + d * x);
        System.out.println(d + " * " + ++x + " = " + d * x);
        System.out.println(d + " * " + ++x + " = " + d * x);


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        tabl(scanner.nextInt());

    }
}
