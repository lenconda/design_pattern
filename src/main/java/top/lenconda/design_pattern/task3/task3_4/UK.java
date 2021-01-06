package top.lenconda.design_pattern.task3.task3_4;

public class UK extends Country {
    public UK() {
        this.name = new String("UK");
    }

    public void sendMessageByWTO(String country, String msg) {
        wto.sendMessage(this.name, country, msg);
    }
}
