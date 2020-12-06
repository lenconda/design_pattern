package top.lenconda.design_pattern.task1.task1_7;

public class ShortPerson extends PersonBuilder {
    public void buildHead() {
        person.setHead("Short head");
    }

    public void buildBody() {
        person.setBody("Short body");
    }

    public void buildArm() {
        person.setArm("Short arm");
    }

    public void buildLeg() {
        person.setLeg("Short leg");
    }
}
