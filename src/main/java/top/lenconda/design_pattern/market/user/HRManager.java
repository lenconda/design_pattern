package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.request.HRRequest;
import top.lenconda.design_pattern.market.request.Request;

public class HRManager extends User {
    public HRManager(String name, String username, String password, String role) {
        super(name, username, password, role);
    }

    @Override
    public void request(Request request) {}

    public void approve(HRRequest request) {
        System.out.println("HR Manager: Approved HR request id " + request.id + ": " + request.action + " user " + request.targetUser.name + "(" + request.targetUser.username + ")");
    }
}
