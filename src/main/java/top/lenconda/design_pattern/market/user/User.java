package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;

import java.util.Date;

public abstract class User {
    public String username;
    public String name;
    public String password;
    public int gender;
    public Date birthday;
    public Date joinDate;
    public String phone;
    public String qq;
    public String wechat;
    public String address;
    public Department department;

    public User(String name, String username, String password, String role) {
        this.name = name;
    }

    public String toString() {
        return "{"
                + "username: " + username
                + ", name: " + name
                + ", gender: " + (gender == 0 ? "male" : "female")
                + ", birthDay: " + birthday.toString()
                + ", joinDate: " + joinDate.toString()
                + ", phone: " + phone
                + ", qq: " + qq
                + ", wechat: " + wechat
                + ", address: " + address
                + "}";
    }

    public String getInfo() {
        return this.toString();
    }

    public String getInfo(User user) {
        return user.toString();
    }
}
