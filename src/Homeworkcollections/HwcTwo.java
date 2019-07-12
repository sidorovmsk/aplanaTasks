package Homeworkcollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HwcTwo {
    public static void main(String[] args) throws FileNotFoundException {
        List<Myclass> myclassList = new ArrayList<>(); // хранится статистика без повторов
        List<Myclass> myclassListHelp = new ArrayList<>(); // хрянятся все слова
        Scanner scanner = new Scanner(new File("newOneqw.txt"));
        int maxcount;
        int MAXcount = 0;

        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            myclassListHelp.add(new Myclass(word, 1)); // добавляем все слова
            Myclass m = new Myclass(word, 1);
            if (!myclassList.contains(m)) {
                myclassList.add(m);         // добавляем без повтора
            } else myclassList.get(myclassList.indexOf(m)).setCount(0);
        }

        for (Myclass value : myclassList) { // изменяем показание счетчика
            int num = 1;
            for (Myclass myclass : myclassListHelp) {
                if (value.equals(myclass)) {
                    value.setCount(num++);
                    maxcount = num;
                    if (maxcount > MAXcount) {
                        MAXcount = maxcount;
                    }
                }
            }
        }
        Collections.sort(myclassList);
        System.out.println("[WithoutMap] Статистика встречаемости слов: " + myclassList);
        System.out.print("[WithoutMap] Слово(а) с максимальным количеством повторений: ");

        for (Myclass myclass : myclassList) {
            if (myclass.count == (MAXcount - 1))
                System.out.print(myclass.word + " ");
        }

        System.out.println();
        System.out.println("[WithoutMap] Количество повторений: " + (MAXcount - 1));
    }
}