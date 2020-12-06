package top.lenconda.design_pattern.task1.task1_5.task1_5_1;

public class Main {
    public static void main(String args[]) {
        Chef northChef = new NorthChef();
        Chef southChef = new SouthChef();
        northChef.cookedNoodles();
        northChef.cookedRice();
        southChef.cookedNoodles();
        southChef.cookedRice();
    }
}
