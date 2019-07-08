package Classwork.Task12;

public class Task12 {
    public static void main(String[] args) {
        int[] ints = new int[20];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxPlace = 0, minPlace = 0, numb;

        for (int i = 0; i < ints.length; i++) {
            int random = (int) (Math.random() * ((10 - (-10)) + 1)) - 10;
            ints[i] = random;
            System.out.print(ints[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
                maxPlace = i;
            }

            if (ints[i] < min) {
                min = ints[i];
                minPlace = i;
            }
        }
        numb = ints[minPlace];
        ints[minPlace] = ints[maxPlace];
        ints[maxPlace] = numb;

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}
