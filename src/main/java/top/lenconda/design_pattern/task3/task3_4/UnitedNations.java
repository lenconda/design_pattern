package top.lenconda.design_pattern.task3.task3_4;

import java.util.Hashtable;

public abstract class UnitedNations {
    protected String name;
    protected Hashtable<String, Country> country;

    public UnitedNations() {
        this.country = new Hashtable<String, Country>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void joinCountry(Country country) {
        if (this.country == null) { return; }
        this.country.put(country.getName(), country);
    }

    public void removeCountry(Country c) {
        if (country == null) { return; }
        country.remove(c.getName());
    }

    protected void sendMessage(String from, String to, String msg) {
        Country c = country.get(to);
        if (c != null) {
            c.receiveMessage(from, msg);
        } else {
            System.out.println("Current country may not in UN...");
        }
    }

    public void receiveMessage(String from, String to, String msg) {
        sendMessage(from, to, msg);
    }
}
