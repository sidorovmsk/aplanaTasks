package Homeworkcollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HwcTwo {
    public static void main(String[] args) throws FileNotFoundException {
        List<Myclass> myclassList = new ArrayList<>();
        List<Myclass> myclassListHelp = new ArrayList<>();
        Set<Myclass> myclassSet = new HashSet<>();
        Scanner scanner = new Scanner(new File("newOneqw.txt"));

        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            myclassList.add(new Myclass(word, 1));
        }

        Collections.sort(myclassList);
        List<Myclass> listHelp = new ArrayList<>(myclassList); // в помощь
        listHelp.add(new Myclass("прост", 0));

        int maxcount = 0;
        int MAXcount = 0;
        for (int i = 0; i < myclassList.size(); i++) {
            maxcount++;
            if (!myclassList.get(i).equals(listHelp.get(i + 1))) {
                myclassSet.add(new Myclass(myclassList.get(i).word, maxcount)); //добавление в myclassSet для статистики
                if (maxcount > MAXcount) {
                    MAXcount = maxcount;
                }
                maxcount = 0;
            }
        }
        myclassListHelp.addAll(myclassSet);
        Collections.sort(myclassListHelp);
        System.out.println("[WithoutMap] Статистика встречаемости слов: " + myclassListHelp);
        System.out.print("[WithoutMap] Слово(а) с максимальным количеством повторений: ");
        for (Myclass myclass : myclassListHelp) {
            if (myclass.count == MAXcount)
                System.out.print(myclass.word + " ");
        }
        System.out.println();
        System.out.println("[WithoutMap] Количество повторений: " + MAXcount);
    }
}