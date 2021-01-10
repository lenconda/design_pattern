package top.lenconda.design_pattern.market.user;

import top.lenconda.design_pattern.market.department.Department;
import top.lenconda.design_pattern.market.request.*;

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

    protected User hrRequestSuccessor;
    protected User holidayRequestSuccessor;
    protected User holdMeetingRequestSuccessor;
    protected User meetingRoomRequestSuccessor;
    protected User officeSuppliesRequestSuccessor;

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

    public void request(Request request) {
        if (request instanceof HRRequest) {
            if (this.hrRequestSuccessor != null) {
                this.hrRequestSuccessor.request(request);
            } else {
                HRRequest hrRequest = (HRRequest) request;
                hrRequest.users.add(hrRequest.targetUser);
                System.out.println("HR Manager: Approved HR request id " + hrRequest.id + ": " + hrRequest.action + " user " + hrRequest.targetUser.name + "(" + hrRequest.targetUser.username + ")");
            }
        } else if (request instanceof HolidayRequest) {
            if (this.holidayRequestSuccessor != null) {
                this.holidayRequestSuccessor.request(request);
            } else {
                HolidayRequest holidayRequest = (HolidayRequest) request;
                System.out.println("Holiday Manager: Approved " + holidayRequest.creator.name + "'s holiday request, from " + holidayRequest.startDate.toString() + " to " + holidayRequest.endDate.toString());
            }
        } else if (request instanceof HoldMeetingRequest) {
            if (this.holdMeetingRequestSuccessor != null) {
                this.holdMeetingRequestSuccessor.request(request);
            } else {
                HoldMeetingRequest holdMeetingRequest = (HoldMeetingRequest) request;
                System.out.println("Meeting Manager: Approved " + holdMeetingRequest.creator.name + "'s hold meeting request at " + holdMeetingRequest.location);
            }
        } else if (request instanceof MeetingRoomRequest) {
            if (this.meetingRoomRequestSuccessor != null) {
                this.meetingRoomRequestSuccessor.request(request);
            } else {
                MeetingRoomRequest meetingRoomRequest = (MeetingRoomRequest) request;
                System.out.println("Meeting Room Manager: Approved " + meetingRoomRequest.creator.name + "'s meeting room request, at " + meetingRoomRequest.location);
            }
        } else if (request instanceof OfficeSuppliesRequest) {
            if (this.officeSuppliesRequestSuccessor != null) {
                this.officeSuppliesRequestSuccessor.request(request);
            } else {
                OfficeSuppliesRequest officeSuppliesRequest = (OfficeSuppliesRequest) request;
                System.out.println("Office Manager: Approved" + officeSuppliesRequest.creator.name + "'s office supplies request, for " + officeSuppliesRequest.suppliesName + " with quantity of " + officeSuppliesRequest.quantity);
            }
        }
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
}
