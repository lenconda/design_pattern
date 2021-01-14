package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;
import top.lenconda.design_pattern.market.department.OperationDepartment;

public class OperationManager extends Manager {
    public OperationManager(String name, String username, String password, Department department) {
        super(name, username, password, department);
        this.setDepartment(new OperationDepartment());
    }
}
