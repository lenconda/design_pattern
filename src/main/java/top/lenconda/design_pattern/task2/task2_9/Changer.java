package top.lenconda.design_pattern.task2.task2_9;

public class Changer implements GeneralCar {
    private final GeneralCar car;

    public Changer(GeneralCar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
