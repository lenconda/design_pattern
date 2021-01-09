package top.lenconda.design_pattern.market.request;

import top.lenconda.design_pattern.market.user.User;

public abstract class Request {
    public String id;
    public User creator;
    public String content;
}
