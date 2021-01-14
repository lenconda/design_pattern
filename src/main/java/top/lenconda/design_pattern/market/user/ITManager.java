package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.ITDepartment;

public class ITManager extends Manager {
    public ITManager(String name, String username, String password, String role) {
        super(name, username, password, role);
        this.setDepartment(new ITDepartment());
    }
}
