package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.CEODepartment;

public class CEO extends Manager {
    public CEO(String name, String username, String password, String role) {
        super(name, username, password, role);
        this.setDepartment(new CEODepartment());
    }
}
