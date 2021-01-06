package top.lenconda.design_pattern.task3.task3_9;

import java.util.Observable;
import java.util.Observer;

public class Price implements Observer {
    private double currentPrice = 0.00;

    @Override
    public void update(Observable observable, Object value) {
        if (value instanceof Double) {
            currentPrice = ((Double) value).doubleValue();
            System.out.println("Product's price changed to: " + currentPrice);
        }
    }
}
