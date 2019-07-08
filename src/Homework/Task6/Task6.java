package Homework.Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество сигар:");
        int numb = scanner.nextInt();
        System.out.println("День недели{1 - понедельник; 2 - вторник; 3 - среда и тд:");
        int day = scanner.nextInt();
        for (int i = 1; i < 6; i++) {
            if (day == i) {
                if (numb >= 40 && numb <= 60) { // сигар в будни
                    System.out.println(true);
                } else System.out.println(false);
            }
        }
        for (int i = 6; i < 8; i++) {
            if (day == i) {
                if (numb >= 40) {
                    System.out.println(true);
                } else System.out.println(false + " - мало");
            }
        }
    }
}
