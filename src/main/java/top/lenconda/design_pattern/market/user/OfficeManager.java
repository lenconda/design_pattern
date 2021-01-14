package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.OfficeDepartment;

public class OfficeManager extends Manager {
    public OfficeManager(String name, String username, String password, String role) {
        super(name, username, password, role);
        this.setDepartment(new OfficeDepartment());
    }
}
