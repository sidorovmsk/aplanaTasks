package Classwork.Task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {

    private static int plus(int a, int b) {
        int z = a + b;
        return z;
    }

    private static int minus(int a, int b) {
        int z = a - b;
        return z;
    }

    private static int multiply(int a, int b) {
        int z = a * b;
        return z;
    }

    private static double division(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные через пробел (например: - 5 8):");
        String s = reader.readLine();
        String[] strings = s.split("\\s");
        int one = Integer.parseInt(strings[1]);
        int two = Integer.parseInt(strings[2]);

        if (strings[0].equals("+")) {
            System.out.println(plus(one, two));
        }
        if (strings[0].equals("-")) {
            System.out.println(minus(one, two));
        }
        if (strings[0].equals("*")) {
            System.out.println(multiply(one, two));
        }
        if (strings[0].equals("/")) {
            System.out.println(division(one, two));
        }
    }
}
