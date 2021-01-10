package top.lenconda.design_pattern.market.activity;

import java.util.ArrayList;

public abstract class Activity {
    protected ArrayList<DepartmentGroup> departmentGroups;

    public void setDepartmentGroup(ArrayList<DepartmentGroup> departmentGroups) {
        this.departmentGroups = departmentGroups;
    }

    public abstract void begin();
}
