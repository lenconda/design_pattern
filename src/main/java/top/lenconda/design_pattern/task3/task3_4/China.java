package top.lenconda.design_pattern.task3.task3_4;

public class China extends Country {
    public China() {
        this.name = new String("China");
    }

    public void sendMessageByWTO(String country, String msg) {
        wto.sendMessage(this.name, country, msg);
    }
}
