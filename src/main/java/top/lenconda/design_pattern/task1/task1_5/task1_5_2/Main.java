package top.lenconda.design_pattern.task1.task1_5.task1_5_2;

public class Main {
    public static void main(String args[]) {
        Chef northChef = new NorthChef();
        Chef southChef = new SouthChef();
        Chef americanChef = new AmericanChef();
        northChef.cookedNoodles();
        northChef.cookedRice();
        southChef.cookedNoodles();
        southChef.cookedRice();
        americanChef.cookedNoodles();
        americanChef.cookedRice();
    }
}
