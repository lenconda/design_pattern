package top.lenconda.design_pattern.task3.task3_4;

public abstract class Country {
    protected String name;
    protected UnitedNations wto;
    protected UnitedNations who;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitedNations getWto() {
        return wto;
    }

    public void setWto(UnitedNations wto) {
        this.wto = wto;
    }

    public UnitedNations getWho() {
        return who;
    }

    public void setWho(UnitedNations who) {
        this.who = who;
    }

    public UnitedNations getWfc() {
        return wfc;
    }

    public void setWfc(UnitedNations wfc) {
        this.wfc = wfc;
    }

    protected UnitedNations wfc;

    public abstract void sendMessageByWTO(String country, String msg);

    public void sendMessageByWHO(String country, String msg) {
        who.sendMessage(this.name, country, msg);
    }

    public void sendMessageByWFC(String country, String msg) {
        wfc.sendMessage(this.name, country, msg);
    }

    public void receiveMessage(String c, String msg) {
        System.out.println(name + " get a message from " + c + ": " + msg);
    }
}
