package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.request.HRRequest;
import top.lenconda.design_pattern.market.request.Request;

import java.util.ArrayList;
import java.util.Date;

public abstract class Manager extends User {
    public Manager(String name, String username, String password, String role) {
        super(name, username, password, role);
    }

    @Override
    public void request(Request request) {
        if (request instanceof HRRequest) {
            if (this.hrRequestSuccessor != null) {
                this.hrRequestSuccessor.request(request);
            } else {
                HRRequest hrRequest = (HRRequest) request;
                hrRequest.users.add(hrRequest.targetUser);
                System.out.println("HR Manager: Approved HR request id " + hrRequest.id + ": " + hrRequest.action + " user " + hrRequest.targetUser.name + "(" + hrRequest.targetUser.username + ")");
            }
        }
    }

    public void createStuff(String name, String username, String password, String role, ArrayList<User> users) {
        UserFactory userFactory = new UserFactory();
        User stuff = userFactory.createUser(name, username, password, role, this.department);
        stuff.setJoinDate(new Date());
        HRRequest request = new HRRequest();
        request.setTargetUser(stuff);
        request.setUsers(users);
        this.request(request);
    }

    public void createStuff(User user, ArrayList<User> users) {
        if (!user.department.id.equals(this.department.id)) {
            return;
        }
        User stuff = user.clone();
        stuff.setJoinDate(new Date());
        HRRequest request = new HRRequest();
        request.setTargetUser(stuff);
        request.setUsers(users);
        this.request(request);
    }
}
