package Classwork.Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        double a = Double.parseDouble(num);
        double b = a % 5;
        if (b >= 0 && b < 3) {
            System.out.println("зелёный");
        } else if (b >= 3 && b < 4) {
            System.out.println("жёлтый");
        } else if (b >= 4 && b < 5) {
            System.out.println("красный");
        }
    }
}
