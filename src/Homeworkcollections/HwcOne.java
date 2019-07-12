package Homeworkcollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HwcOne {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("newOneqw.txt"));
        Map<String, Integer> statistics = new TreeMap<>();
        int maxCount = 0;
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
            if (maxCount < count) maxCount = count;
        }
        System.out.println("[UseMap] Статистика встречаемости слов: " + statistics);
        System.out.print("[UseMap] Слово(а) с максимальным количеством повторений: ");

        for (Map.Entry<String, Integer> pair : statistics.entrySet()) {
            if (pair.getValue() == maxCount) System.out.print(pair.getKey() + " ");
        }
        System.out.println();
        System.out.println("[UseMap] Количество повторений: " + maxCount);
    }
}