package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.request.Request;

public class Stuff extends User {
    public Stuff(String name, String username, String password, String role) {
        super(name, username, password, role);
    }

    @Override
    public void request(Request request) {}
}
