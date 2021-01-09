package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.request.HRRequest;

public class Manager extends User {
    public Manager(String name, String username, String password, String role) {
        super(name, username, password, role);
    }

    public void approve(HRRequest request) {
        System.out.println("HR Manager: Approved HR request id " + request.id + ": " + request.action + " user " + request.targetUser.name + "(" + request.targetUser.username + ")");
    }
}
