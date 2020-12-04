package Classwork.Task15;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private double price;
    private int weight;
    private List<Sweet> sweets = new ArrayList<>();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public void setSweets(List<Sweet> sweets) {
        this.sweets = sweets;
    }


    public Gift addSweet(Sweet sweet) {
        sweets.add(sweet);
        price += sweet.getPrice();
        weight += sweet.getWeight();
        return this;
    }
}
