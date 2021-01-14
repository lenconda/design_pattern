package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;
import top.lenconda.design_pattern.market.department.HRDepartment;

public class HRManager extends Manager {
    public HRManager(String name, String username, String password, Department department) {
        super(name, username, password, department);
        this.setDepartment(new HRDepartment());
    }
}
