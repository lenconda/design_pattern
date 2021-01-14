package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;

public class Stuff extends User {
    public Stuff(String name, String username, String password, Department department) {
        super(name, username, password, department);
    }

    @Override
    public void addStuff(User stuff) {
        System.out.println("Stuff cannot add stuff");
    }

    @Override
    public void addStuff(User stuff, Department department) {
        System.out.println("Stuff cannot add stuff");
    }

    @Override
    public void removeStuff(User stuff) {
        System.out.println("Cannot remove stuff");
    }

    @Override
    public User getStuffByIndex(int index) {
        System.out.println("Cannot find user");
        return null;
    }
}
