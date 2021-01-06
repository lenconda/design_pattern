package top.lenconda.design_pattern.task3.task3_10;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Sound();
        phone.alert();
        System.out.println();

        Vibrate vibration = new Vibrate(phone);
        vibration.alert();
        vibration.alertVibrate();
        System.out.println();

        LightsFlash lightsFlashing = new LightsFlash(phone);
        lightsFlashing.alert();
        lightsFlashing.alertLightsFlash();
        System.out.println();

        VibrateLightsFlash vibrateLightsFlash = new VibrateLightsFlash(phone);
        vibrateLightsFlash.alert();
        vibrateLightsFlash.alertVibrateLightsFlash();
    }
}
