package Homework.Task2;


public class Task2 {

    private static char rndChar() { // метод добавления буквы
        int rnd = (int) (Math.random() * 52);
        char base = (rnd < 26) ? 'A' : 'a';
        return (char) (base + rnd % 26);
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 4; i++) { // первые 4 числа
            stringBuilder.append((int) (Math.random() * 10));
        }

        for (int i = 0; i < 2; i++) { // две буквы
            stringBuilder.append(rndChar());
        }

        for (int i = 0; i < 4; i++) { // 0 or 1
            stringBuilder.append((int) (Math.random() * 2));
        }

        int random_number1 = (int) ((Math.random() * ((9 - 6) + 1)) + 6); // рандомный выбор места под 1

        stringBuilder.setCharAt(random_number1, '1'); // вставляем 1
        System.out.println(stringBuilder);
    }
}