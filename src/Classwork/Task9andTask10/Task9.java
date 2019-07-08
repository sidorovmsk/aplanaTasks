package Classwork.Task9andTask10;

import java.io.*;

public class Task9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("C:/Users/Александр/Desktop/newOne.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        String s;
        int qwe = 0;
        while ((line = fin.readLine()) != null) {
            System.out.println(line);
            qwe++;
        }
        FileWriter writer = new FileWriter(f);

        for (int i = 0; i < qwe; i++) {
            s = br.readLine();
            writer.write(s + " \n");

        }
        writer.flush();
    }
}