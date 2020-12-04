package Classwork.Task15;


import Classwork.Task15.Sweets.Candy;
import Classwork.Task15.Sweets.Nuts;

import java.util.Comparator;

public class Task15 {
    public static void main(String[] args) {
        Nuts nuts = new Nuts("Some nuts", 5, 8.5, Sweet.Sweetness.NotSweet);
        Candy candy = new Candy("Some candy", 10, 10.5, Sweet.Sweetness.MediumSweet);
        Candy candyTwo = new Candy("Some candy", 10, 10.5, Sweet.Sweetness.AbsolutelySweet);
        Candy candyThree = new Candy("Some candy", 10, 10.5, Sweet.Sweetness.NotSweet);

        Gift gift = new Gift();

        gift.addSweet(nuts).addSweet(candy).addSweet(candyTwo).addSweet(candyThree);

        gift.getSweets().sort(Comparator.comparing(Sweet::getSweetness));

        System.out.println(gift.getPrice());
        System.out.println(gift.getSweets());
        System.out.println(gift.getWeight());
    }
}
