package top.lenconda.design_pattern.task2.task2_10;

public class Main {
    public static void main(String args[]) {
        Milk milk;
        Cup cup;

        milk = (Milk) XMLUtil.getBean("Milk");
        cup = (Cup) XMLUtil.getBean("Cup");

        assert cup != null;
        cup.setMilk(milk);
        cup.pack("coffee");
    }
}
