package Classwork.Task15;

public abstract class Sweet {
    String name;
    int weight;
    Double price;
    private Sweetness Sweetness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweet - \"" + name + "\" \n" +
                "weight=" + weight + "; \n" +
                "price=" + price + "; \n" +
                "Sweetness=" + Sweetness + ". \n";
    }

    public Sweet.Sweetness getSweetness() {
        return Sweetness;
    }

    public void setSweetness(Sweet.Sweetness sweetness) {
        Sweetness = sweetness;
    }

    public Sweet(String name, int weight, Double price, Sweet.Sweetness sweetness) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        Sweetness = sweetness;
    }

    public enum Sweetness {
        AbsolutelySweet,
        MediumSweet,
        NotSweet;
    }

}
