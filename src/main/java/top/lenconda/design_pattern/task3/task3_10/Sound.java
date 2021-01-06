package top.lenconda.design_pattern.task3.task3_10;

public final class Sound implements Phone {
    public Sound() {
        System.out.println("Phone is playing sound to notify owner");
    }

    @Override
    public void alert() {
        System.out.println("Playing sound");
    }
}
