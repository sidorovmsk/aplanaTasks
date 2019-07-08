package Homework.Task1;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> stringsOne = new ArrayList<>();
        ArrayList<Character> stringsTwo = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        System.out.println("Введите первое существующее слово:");
        String one = in.nextLine();
        System.out.println("Введите второе существующее слово:");
        String two = in.nextLine();

        StringBuilder stringBuilderOne = new StringBuilder(one);
        StringBuilder stringBuilderTwo = new StringBuilder(two);

        for (int i = 0; i < stringBuilderOne.length(); i++) {
            stringsOne.add(stringBuilderOne.charAt(i));
        }
        for (int i = 0; i < stringBuilderTwo.length(); i++) {
            stringsTwo.add(stringBuilderTwo.charAt(i));
        }

        Collections.sort(stringsOne); // сортируем по алфавиту
        Collections.sort(stringsTwo);
        StringBuilder stringBuilderOO = new StringBuilder();
        StringBuilder stringBuilderTT = new StringBuilder();

        for (Character character : stringsOne) {
            stringBuilderOO.append(character);
        }
        for (Character character : stringsTwo) {
            stringBuilderTT.append(character);
        }

        String s = stringBuilderOO.toString();

        int len1;
        do{
            len1 = s.length();//сохраняем длину строки
            s = s.replaceAll("([a-z])\\1", "");
        }while(len1 != s.length());//сравниваем новую длину строки с сохраненной длиной
        String ss = stringBuilderTT.toString();

        int len2;
        do{
            len2 = ss.length();//сохраняем длину строки
            ss = ss.replaceAll("([a-z])\\1", "");
        }while(len2 != ss.length());//сравниваем новую длину строки с сохраненной длиной
        String result = s + ss;

        char[] arr = result.toCharArray();

        for (char c : arr) { //добавляем в карту пару ключ значение
            int count = 0;
            for (char value : arr) {
                if (c == value) {
                    count++;
                }
            }
            map.put(c, count);
        }
        System.out.println("Результат:");
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            if (pair.getValue() == 2) System.out.print(pair.getKey());
        }
    }
}
