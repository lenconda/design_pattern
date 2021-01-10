package top.lenconda.design_pattern.market.store;

import top.lenconda.design_pattern.market.user.Manager;
import top.lenconda.design_pattern.market.user.User;

import java.util.ArrayList;

public class GoodsCategory {
    private String id;
    private String name;
    private ArrayList<User> managers;
    private ArrayList<User> stuffs;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<User> getManagers() {
        return managers;
    }

    public ArrayList<User> getStuffs() {
        return stuffs;
    }

    public void addStuff(User stuff, User operator) {
        if (!this.managers.contains(operator) || !operator.department.getId().equals("sales")) {
            System.out.println("You have no permission to add stuff");
            return;
        }
        this.stuffs.add(stuff);
    }

    public void removeStuff(User stuff, User operator) {
        if (!this.managers.contains(operator)) {
            System.out.println("You have no permission to remove stuff");
            return;
        }
        this.stuffs.remove(stuff);
    }

    public void addManager(User manager, User operator) {
        if (!this.managers.contains(operator) || !(operator instanceof Manager) || !operator.department.getId().equals("sales")) {
            System.out.println("You have no permission to add manager");
            return;
        }
        this.managers.add((manager));
    }

    public void removeManager(User manager, User operator) {
        if (!this.managers.contains(operator)) {
            System.out.println("You have no permission to remove manager");
            return;
        }
        this.managers.remove((manager));
    }
}
