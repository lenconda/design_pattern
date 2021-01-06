package top.lenconda.design_pattern.task3.task3_9;

import java.util.Observable;
import java.util.Observer;

public class Name implements Observer {
    private String currentName = null;

    @Override
    public void update(Observable observable, Object value) {
        if (value instanceof String) {
            currentName = (String) value;
            System.out.println("Product's name changed to: " + currentName);
        }
    }
}
