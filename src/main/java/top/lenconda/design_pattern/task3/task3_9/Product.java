package top.lenconda.design_pattern.task3.task3_9;

import java.util.Observable;

public class Product extends Observable {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers(name);
    }

    public void setPrice(double price) {
        this.price = price;
        setChanged();
        notifyObservers(price);
    }
}
