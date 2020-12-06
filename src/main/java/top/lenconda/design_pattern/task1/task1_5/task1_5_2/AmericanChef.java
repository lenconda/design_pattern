package top.lenconda.design_pattern.task1.task1_5.task1_5_2;

public class AmericanChef extends Chef {
    @Override
    public Rice cookedRice() {
        return new AmericanRice();
    }

    @Override
    public Noodles cookedNoodles() {
        return new AmericanNoodles();
    }
}
