package Homework.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        System.out.println("Введите данные разделенные пробелами: ");

        String str = readLine.nextLine();
        String[] data = str.split("\\s");

        readLine.close();

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(data));
        arrayList.sort(new LengthFirstComparator());

        for (String s : arrayList) {
            if (!s.equals("")) {
                System.out.print(s + " ");  //печать по убыванию длинн
            }
        }
    }
}
