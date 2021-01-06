package top.lenconda.design_pattern.task3.task3_10;

public class VibrateLightsFlash extends Changer {
    public VibrateLightsFlash(Phone phone) {
        super(phone);
        System.out.println("Phone is playing sound, flashing lights and vibrating to notify owner");
    }

    public void alertVibrateLightsFlash() {
        System.out.println("Flashing lights and vibrating");
    }
}
