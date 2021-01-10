package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.request.HRRequest;
import top.lenconda.design_pattern.market.store.GoodsCategory;

import java.util.ArrayList;
import java.util.Date;

public abstract class Manager extends User {
    public Manager(String name, String username, String password, String role) {
        super(name, username, password, role);
    }

    public void createStuff(String name, String username, String password, String role, ArrayList<User> users) {
        UserFactory userFactory = new UserFactory();
        User stuff = userFactory.createUser(name, username, password, role, this.department);
        stuff.setJoinDate(new Date());
        HRRequest request = new HRRequest(this);
        request.setTargetUser(stuff);
        request.setUsers(users);
        this.request(request);
    }

    public void createStuff(User user, ArrayList<User> users) {
        if (!user.department.getId().equals(this.department.getId())) {
            return;
        }
        User stuff = user.clone();
        stuff.setJoinDate(new Date());
        HRRequest request = new HRRequest(this);
        request.setTargetUser(stuff);
        request.setUsers(users);
        this.request(request);
    }

    public void updateGoodsCategory(GoodsCategory category) {
        if (!category.getManagers().contains(this)) {
            System.out.println("You do not have permission to update this category");
            return;
        }

    }
}
