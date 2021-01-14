package top.lenconda.design_pattern.market.department;

import top.lenconda.design_pattern.market.activity.DepartmentGroup;
import top.lenconda.design_pattern.market.user.Manager;
import top.lenconda.design_pattern.market.user.User;

import java.util.ArrayList;
import java.util.Date;

public class Department implements DepartmentGroup {
    private String id;
    private String name;
    private final Date createdDate;
    private ArrayList<User> members;

    public Department() {
        this.createdDate = new Date();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getMembers() {
        return this.members;
    }

    public void addMember(User user, User operator) {
        if (!operator.getDepartment().getId().equals("it")) {
            if (!(operator instanceof Manager)) {
                System.out.println("You cannot add a member with out a manager role");
                return;
            }

            if (operator.getDepartment() != this) {
                System.out.println("Cannot manage other department's members");
                return;
            }
        }

        user.setDepartment(this);
        this.members.add(user);
    }

    public void removeMember(User user, User operator) {
        if (!operator.getDepartment().getId().equals("it")) {
            if (!(operator instanceof Manager)) {
                System.out.println("You cannot remove a member with out a manager role");
                return;
            }

            if (operator.getDepartment() != this) {
                System.out.println("Cannot manage other department's members");
                return;
            }
        }

        user.setDepartment(null);
        this.members.remove(user);
    }

    @Override
    public void join() {
        System.out.println(this.id.toUpperCase() + " joins this activity");
    }
}
