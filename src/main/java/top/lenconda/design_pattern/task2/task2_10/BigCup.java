package top.lenconda.design_pattern.task2.task2_10;

public class BigCup extends Cup {
    @Override
    public void pack(String name) {
        this.milk.milk("Big cup", name);
    }
}
