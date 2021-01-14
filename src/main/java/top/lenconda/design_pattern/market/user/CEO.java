package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.CEODepartment;
import top.lenconda.design_pattern.market.department.Department;

public class CEO extends Manager {
    public CEO(String name, String username, String password, Department department) {
        super(name, username, password, department);
        this.setDepartment(new CEODepartment());
    }
}
