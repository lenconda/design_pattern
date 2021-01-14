package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;
import top.lenconda.design_pattern.market.department.OfficeDepartment;

public class OfficeManager extends Manager {
    public OfficeManager(String name, String username, String password, Department department) {
        super(name, username, password, department);
        this.setDepartment(new OfficeDepartment());
    }
}
