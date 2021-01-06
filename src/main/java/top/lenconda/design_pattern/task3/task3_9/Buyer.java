package top.lenconda.design_pattern.task3.task3_9;

import java.util.Observable;
import java.util.Observer;

public class Buyer implements Observer {
    public void update(Observable observable, Object value) {
        Product product = (Product) observable;

        if (value instanceof String) {
            System.out.println("Product's name changed to: " + product.getName());
        }

        if (value instanceof Double) {
            System.out.println("Product's price changed to: " + product.getPrice());
        }
    }
}
