package top.lenconda.design_pattern.task1.task1_1;

public class NvWa {
    public Person make(String str) {
        Person person = null;
        switch (str) {
            case "M":
                person = new Man();
                break;
            case "W":
                person = new Woman();
                break;
            case "R":
                person = new Robot();
                break;
            default:
                break;
        }
        return person;
    }
}
