package top.lenconda.design_pattern.task2.task2_9;

public class Fly extends Changer {
    public Fly(GeneralCar car) {
        super(car);
    }

    public void fly() {
        System.out.println("Cars can fly!");
    }
}
