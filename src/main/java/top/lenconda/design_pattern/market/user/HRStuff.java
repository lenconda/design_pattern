package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.request.HRRequest;

public class HRStuff extends User {
    public HRStuff(String name, String username, String password, String role) {
        super(name, username, password, role);
    }

    public void approve(HRRequest request) {
        System.out.println("HR Stuff: Approved HR request id " + request.id + ": " + request.action + " user " + request.targetUser.name + "(" + request.targetUser.username + ")");
    }
}
