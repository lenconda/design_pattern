package top.lenconda.design_pattern.task1.task1_7;

public class TallPerson extends PersonBuilder {
    public void buildHead() {
        person.setHead("Tall head");
    }

    public void buildBody() {
        person.setBody("Tall body");
    }

    public void buildArm() {
        person.setArm("Tall arm");
    }

    public void buildLeg() {
        person.setLeg("Tall leg");
    }
}
