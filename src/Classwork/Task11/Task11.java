package Classwork.Task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {

    public static int binaryToInt(String str) {
        int sum = 0, a;
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);

            if (c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("ошибка");
                break;
            }
            sum += (a * Math.pow(2, i));
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = binaryToInt(reader.readLine());
        System.out.println(x);
    }
}
