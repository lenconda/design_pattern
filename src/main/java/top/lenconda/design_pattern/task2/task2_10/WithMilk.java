package top.lenconda.design_pattern.task2.task2_10;

public class WithMilk implements Milk {
    public void milk(String cupType, String name) {
        System.out.println(cupType + " " + name + " with milk");
    }
}
