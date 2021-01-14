package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;
import top.lenconda.design_pattern.market.request.*;
import top.lenconda.design_pattern.market.transaction.Transaction;

import java.util.ArrayList;
import java.util.Date;

public abstract class User implements Cloneable {
    public String username = "";
    public String name = "";
    public String password = "";
    public int gender = 0;
    public Date birthday = new Date();
    public Date joinDate = new Date();
    public String phone = "";
    public String qq = "";
    public String wechat = "";
    public String address = "";
    public Department department;

    public User getSuperior() {
        return superior;
    }

    public void setSuperior(User superior) {
        this.superior = superior;
    }

    public ArrayList<User> getStuffs() {
        return stuffs;
    }

    public void setStuffs(ArrayList<User> stuffs) {
        this.stuffs = stuffs;
    }

    public User superior;
    public ArrayList<User> stuffs = new ArrayList<>();

    protected User hrRequestSuccessor;
    protected User holidayRequestSuccessor;
    protected User holdMeetingRequestSuccessor;
    protected User meetingRoomRequestSuccessor;
    protected User officeSuppliesRequestSuccessor;
    protected User logisticsSupportRequestSuccessor;

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

    public User getLogisticsSupportRequestSuccessor() {
        return logisticsSupportRequestSuccessor;
    }

    public void setLogisticsSupportRequestSuccessor(User logisticsSupportRequestSuccessor) {
        this.logisticsSupportRequestSuccessor = logisticsSupportRequestSuccessor;
    }

    public User(String name, String username, String password, Department department) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.department = department;
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

    public void request(Request request) {
        if (request instanceof HRRequest) {
            if (this.hrRequestSuccessor != null) {
                this.hrRequestSuccessor.request(request);
            } else {
                HRRequest hrRequest = (HRRequest) request;
                hrRequest.users.add(hrRequest.targetUser);
                System.out.println("HR Manager: Approved HR request id " + hrRequest.id + ": " + hrRequest.action + " user " + hrRequest.targetUser.name + "(" + hrRequest.targetUser.username + ")");
            }
        } else if (request instanceof SupplyRequest) {
            if (this.logisticsSupportRequestSuccessor != null) {
                this.logisticsSupportRequestSuccessor.request(request);
            } else {
                SupplyRequest supplyRequest = (SupplyRequest) request;
                System.out.println("Logistics Manager: Approved logistics request id " + supplyRequest.id + ": add " + supplyRequest.quantity + " for " + supplyRequest.goods.getName());
            }
        }
    }

    public void approveTransaction(Transaction transaction) {
        System.out.println(this.department.getId() + (this instanceof Manager ? " manager" : " stuff") + ": Approved " + transaction.getInvoker().getName() + "'s " + transaction.getName() + " transaction");
    }

    public User clone() {
        User clone = null;
        try {
            clone = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    // 组合模式添加员工，形成树形结构
    public abstract void addStuff(User stuff);
    public abstract void addStuff(User stuff, Department department);
    public abstract void removeStuff(User stuff);
    public abstract User getStuffByIndex(int index);
}
