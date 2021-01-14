package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.HRDepartment;

public class HRManager extends Manager {
    public HRManager(String name, String username, String password, String role) {
        super(name, username, password, role);
        this.setDepartment(new HRDepartment());
    }
}
