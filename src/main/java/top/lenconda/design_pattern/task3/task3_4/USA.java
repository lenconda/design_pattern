package top.lenconda.design_pattern.task3.task3_4;

public class USA extends Country {
    public USA() {
        this.name = new String("USA");
    }

    public void sendMessageByWTO(String country, String msg) {
        wto.sendMessage(this.name, country, msg);
    }
}
