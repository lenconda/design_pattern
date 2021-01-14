package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.OperationDepartment;

public class OperationManager extends Manager {
    public OperationManager(String name, String username, String password, String role) {
        super(name, username, password, role);
        this.setDepartment(new OperationDepartment());
    }
}
