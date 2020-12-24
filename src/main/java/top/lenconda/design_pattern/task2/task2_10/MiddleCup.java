package top.lenconda.design_pattern.task2.task2_10;

public class MiddleCup extends Cup {
    @Override
    public void pack(String name) {
        this.milk.milk("Middle cup", name);
    }
}
