package top.lenconda.design_pattern.task1.task1_5.task1_5_2;

public class NorthChef extends Chef {
    @Override
    public Rice cookedRice() {
        return new NorthRice();
    }

    @Override
    public Noodles cookedNoodles() {
        return new NorthNoodles();
    }
}
