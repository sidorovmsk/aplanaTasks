package Homeworkcollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Hwc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("newOne.txt"));
        Map<String, Integer> statistics = new HashMap<>();
        List<String> words = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        int maxCount = 0;
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            words.add(word);
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
            if (maxCount < count) maxCount = count;
        }
        System.out.println("Прочитанные слова: " + words);
        Collections.sort(words);
        System.out.println("Отсортированные в алфавитном порядке: " + words);
        System.out.println("[UseMap] Статистика встречаемости слов: " + statistics);
        System.out.print("[UseMap] Слово с максимальным количеством повторений: ");

        for (Map.Entry<String, Integer> pair : statistics.entrySet()) {
            if (pair.getValue() == maxCount) System.out.println(pair.getKey());
        }
        System.out.println("[UseMap] Количество повторений: " + maxCount);

        List<String> wordsNew = new ArrayList<>(words);
        wordsNew.add("простодобавленноеслововконецсписка");

        System.out.print("[WithoutMap] Статистика встречаемости слов: ");
        int count = 1;
        for (int i = 0; i < words.size(); i++) {
            String s = words.get(i);
            if (s.equals(wordsNew.get(i + 1))) {
                count++;
            }
            if (!s.equals(wordsNew.get(i + 1))) {
                integers.add(count);
                System.out.print(s + "=" + count + ", ");
                count = 1;
            }
        }
        int maxCount2 = Collections.max(integers);
        System.out.println();

        System.out.print("[WithoutMap] Слово с максимальным количеством повторений: ");
        for (int i = 0; i < words.size(); i++) {
            String s = words.get(i);
            if (s.equals(wordsNew.get(i + 1))) {
                count++;
            }
            if (!s.equals(wordsNew.get(i + 1))) {
                if (count == maxCount2)
                    System.out.print(s);
                count = 1;
            }
        }

        Collections.sort(integers);
        System.out.println();
        System.out.println("[WithoutMap] Количество повторений: " + maxCount2);
    }
}
