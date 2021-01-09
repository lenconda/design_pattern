package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;

import java.util.Date;

public class UserFactory {
    public User createUser(String name, String username, String password, String role, Department department) {
        User user;

        if (role.equals("stuff")) {
            if (department.equals("hr")) {
                user = new HRStuff(name, username, password, role);
            } else {
                user = new Stuff(name, username, password, role);
            }
        } else {
            user = new Stuff(name, username, password, role);
        }

        user.joinDate = new Date();

        return user;
    }
}
