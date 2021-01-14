package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.request.Request;

public class Admin extends User {
    public Admin(String name, String username, String password, String role) {
        super(name, username, password, role);
    }

    @Override
    public void request(Request request) {

    }

    @Override
    public void addStuff(User stuff) {

    }

    @Override
    public void removeStuff(User stuff) {

    }

    @Override
    public User getStuffByIndex(int index) {
        return null;
    }
}
