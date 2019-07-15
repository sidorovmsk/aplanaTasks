package Homeworkcollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HwcTwo {

    public static void main(String[] args) throws FileNotFoundException {
        List<Myclass> myClassList = new ArrayList<>();
        Scanner scanner = new Scanner(new File("newOneqw.txt"));
        int maxCount = 0;
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Myclass m = new Myclass(word, 1);
            if (!myClassList.contains(m)) { // если нет добавляем
                myClassList.add(m);
            } else                          // если есть увеличиваем count
                myClassList.set(myClassList.indexOf(m), new Myclass(word, ++myClassList.get(myClassList.indexOf(m)).count));
            if (myClassList.get(myClassList.indexOf(m)).count >= maxCount) // находим maxCount
                maxCount = myClassList.get(myClassList.indexOf(m)).count;
        }
        Collections.sort(myClassList);
        System.out.println("[WithoutMap] Статистика встречаемости слов: " + myClassList);
        System.out.print("[WithoutMap] Слово(а) с максимальным количеством повторений: ");

        for (Myclass myclass : myClassList) {
            if (myclass.count == maxCount) System.out.print(myclass.word + " ");
        }
        System.out.println();
        System.out.println("[WithoutMap] Количество повторений: " + maxCount);
    }
}