package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;
import top.lenconda.design_pattern.market.department.SalesDepartment;

public class SalesManager extends Manager {
    public SalesManager(String name, String username, String password, Department department) {
        super(name, username, password, department);
        this.setDepartment(new SalesDepartment());
    }
}
