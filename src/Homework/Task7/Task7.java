package Homework.Task7;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) throws Exception {

        Random random = new Random();
        int minDay = (int) LocalDate.of(2000, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        Scanner scanner = new Scanner(System.in);
        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        System.out.println(randomBirthDate.getMonthValue() + "-" + randomBirthDate.getDayOfMonth() + " - это рандомная дата");
        System.out.println("Введите месяц:");
        int m = scanner.nextInt();
        System.out.println("Введите день:");
        int d = scanner.nextInt();
        LocalDate in = LocalDate.of(randomBirthDate.getYear(), m, d);
        System.out.println("Введите скорость:");
        int speed = scanner.nextInt();

        System.out.println("Результат:");
        if (randomBirthDate.isEqual(in)) {
            if (speed <= 65) {
                System.out.println("0");
            }
            if (speed > 65 & speed <= 85) {
                System.out.println("1");
            }
            if (speed > 85) System.out.println("2");
        }
        if (!randomBirthDate.isEqual(in)) {
            if (speed <= 60) {
                System.out.println("0");
            }
            if (speed > 60 & speed <= 80) {
                System.out.println("1");
            }
            if (speed > 80) System.out.println("2");
        }
    }
}
