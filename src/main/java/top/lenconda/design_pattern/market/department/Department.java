package top.lenconda.design_pattern.market.department;

import java.util.Date;

public class Department {
    private String id;
    private String name;
    private Date createdDate;

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
}
