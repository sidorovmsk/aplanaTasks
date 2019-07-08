package Classwork.Task2;

import java.util.Scanner;

public class task2 {

    //время года

    public static void season(int month) {
        if (month >= 1 && month <= 2) {
            System.out.println("зима");
        } else if (month == 12)
            System.out.println("зима");
        if (month >= 3 && month <= 5)
            System.out.println("весна");
        if (month >= 6 && month <= 8)
            System.out.println("лето");
        if (month >= 9 && month <= 11)
            System.out.println("осень");
        if (month == 0 | month > 12 | month < 0)
            System.out.println("Вне диапазона");
    }

    public static void seasonWithSwitch(int month) {

        switch (month) {

            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Вне диапазона");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        season(scanner.nextInt());
        seasonWithSwitch(scanner.nextInt());
    }
}
