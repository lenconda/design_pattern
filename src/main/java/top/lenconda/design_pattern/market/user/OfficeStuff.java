package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;

public class OfficeStuff extends Stuff {
    public OfficeStuff(String name, String username, String password, Department department) {
        super(name, username, password, department);
    }
}
