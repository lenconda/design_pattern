package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;
import top.lenconda.design_pattern.market.request.Request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public abstract class User {
    public String username;
    public String name;
    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public User getHrRequestSuccessor() {
        return hrRequestSuccessor;
    }

    public void setHrRequestSuccessor(User hrRequestSuccessor) {
        this.hrRequestSuccessor = hrRequestSuccessor;
    }

    public int gender;
    public Date birthday;
    public Date joinDate;
    public String phone;
    public String qq;
    public String wechat;
    public String address;
    public Department department;

    protected User hrRequestSuccessor;

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

    public abstract void request(Request request);

    public User clone() {
        User clone = null;
        try {
            clone = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
