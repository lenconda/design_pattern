package top.lenconda.design_pattern.task2.task2_9;

public class Main {
    public static void main(String args[]) {
        GeneralCar car;
        car = new Car();
        car.move();
        Fly carFly = new Fly(car);
        System.out.println();
        carFly.move();
        carFly.fly();
    }
}
