package top.lenconda.design_pattern.market.auth;

import top.lenconda.design_pattern.market.user.User;

import java.util.ArrayList;

public class Login {
    private ArrayList<User> users;

    public Login(ArrayList<User> users) {
        this.users = users;
    }

    public User login(String username, String password) {
        User result = null;

        for (User user: users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }
}
