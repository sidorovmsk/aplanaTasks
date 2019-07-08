package Classwork.Task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task14 {

    private static void max(String[] strings) {
        int max = 0;
        int maxNumb = 0;
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (i == 0) max = s.length();
            if (max < s.length()) {
                max = s.length();
                maxNumb = i;
            }
        }
        System.out.println(strings[maxNumb]);
    }

    private static void min(String[] strings) {
        int min = 0;
        int minNumb = 0;
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (i == 0) min = s.length();
            if (min > s.length()) {
                min = s.length();
                minNumb = i;
            }
        }
        System.out.println(strings[minNumb]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива:");
        String[] strings = new String[Integer.parseInt(reader.readLine())];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
        }

        max(strings);
        min(strings);

    }
}
