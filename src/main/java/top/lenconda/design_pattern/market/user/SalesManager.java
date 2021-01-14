package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.SalesDepartment;

public class SalesManager extends Manager {
    public SalesManager(String name, String username, String password, String role) {
        super(name, username, password, role);
        this.setDepartment(new SalesDepartment());
    }
}
