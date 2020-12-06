package top.lenconda.design_pattern.task1.task1_7;

public class Painter {
    private PersonBuilder personBuilder;

    public void setPersonBuilder(PersonBuilder pb) {
        this.personBuilder = pb;
    }

    public Person construct() {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArm();
        personBuilder.buildLeg();
        return personBuilder.getPerson();
    }
}
