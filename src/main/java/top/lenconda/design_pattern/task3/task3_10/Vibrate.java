package top.lenconda.design_pattern.task3.task3_10;

public class Vibrate extends Changer {
    public Vibrate(Phone phone) {
        super(phone);
        System.out.println("Phone is playing sound and vibrating to notify owner");
    }

    public void alertVibrate() {
        System.out.println("Vibrating");
    }
}
