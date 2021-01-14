package top.lenconda.design_pattern.market.transaction;

import top.lenconda.design_pattern.market.user.User;

import java.util.ArrayList;

public abstract class Transaction {
    public Transaction(User invoker, String name) {
        this.invoker = invoker;
        this.name = name;
    }

    protected String name;
    protected User invoker;
    protected ArrayList<User> receivers = new ArrayList<>();

    public ArrayList<User> getReceivers() {
        return receivers;
    }

    public User getInvoker() {
        return invoker;
    }

    public String getName() {
        return name;
    }

    public void setReceivers(ArrayList<User> receivers) {
        this.receivers = receivers;
    }

    public abstract void execute();
}
