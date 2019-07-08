package Classwork.Task8;

import java.io.*;

public class Task8 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        //   FileReader fileReader = new FileReader("file.txt"); //
        //   Scanner sc = new Scanner(fileReader);

        FileWriter fileWriter = new FileWriter("file.txt");

        String s;
        while (true) {
            s = reader.readLine();
            if (!s.equals("exit")) {
                writer.write(s);
                writer.newLine();
            } else {
                writer.write(s);
                break;
            }
        }
        fileWriter.write(s);
        reader.close();
        writer.close();
    }
}
