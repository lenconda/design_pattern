package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;
import top.lenconda.design_pattern.market.request.HRRequest;
import top.lenconda.design_pattern.market.store.GoodsCategory;

import java.util.ArrayList;
import java.util.Date;

public class Manager extends User {
    public Manager(String name, String username, String password, Department department) {
        super(name, username, password, department);
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

    @Override
    public void addStuff(User stuff) {
        stuff.setSuperior(this);
        this.stuffs.add(stuff);
    }

    @Override
    public void addStuff(User stuff, Department department) {
        stuff.setSuperior(this);
        stuff.setDepartment(this.department);
        this.stuffs.add(stuff);
    }

    @Override
    public void removeStuff(User stuff) {
        this.stuffs.remove(stuff);
        stuff.setSuperior(null);
        stuff.setDepartment(null);
    }

    @Override
    public User getStuffByIndex(int index) {
        return this.stuffs.get(index);
    }
}
