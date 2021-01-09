package top.lenconda.design_pattern.market.request;

import top.lenconda.design_pattern.market.user.User;

import java.util.ArrayList;

public class HRRequest extends Request {
    public String action;
    public User targetUser;
    public ArrayList<User> users;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public User getTargetUser() {
        return targetUser;
    }

    public void setTargetUser(User targetUser) {
        this.targetUser = targetUser;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
