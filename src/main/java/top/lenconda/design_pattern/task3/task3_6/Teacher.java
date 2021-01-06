package top.lenconda.design_pattern.task3.task3_6;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    public void update(Observable observable, Object params) {
        Department department = (Department) observable;
        System.out.println("Teacher changed department name to: " + department.getDepartmentName());
    }
}
