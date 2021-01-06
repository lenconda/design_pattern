package top.lenconda.design_pattern.task3.task3_10;

public class Changer implements Phone {
    private Phone phone;

    public Changer(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void alert() {
        phone.alert();
    }
}
