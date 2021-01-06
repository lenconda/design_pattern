package top.lenconda.design_pattern.task3.task3_10;

public class LightsFlash extends Changer {
    public LightsFlash(Phone phone) {
        super(phone);
        System.out.println("Phone is playing sound and flashing lights to notify owner");
    }

    public void alertLightsFlash() {
        System.out.println("Flashing lights");
    }
}
