package top.lenconda.design_pattern.market.department;

import top.lenconda.design_pattern.market.activity.DepartmentGroup;

import java.util.Date;

public class Department implements DepartmentGroup {
    private String id;
    private String name;
    private final Date createdDate;

    public Department() {
        this.createdDate = new Date();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void join() {
        System.out.println(this.id.toUpperCase() + " joins this activity");
    }
}
