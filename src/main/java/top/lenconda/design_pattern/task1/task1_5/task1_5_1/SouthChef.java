package top.lenconda.design_pattern.task1.task1_5.task1_5_1;

public class SouthChef extends Chef {
    @Override
    public Rice cookedRice() {
        return new SouthRice();
    }

    @Override
    public Noodles cookedNoodles() {
        return new SouthNoodles();
    }
}
