package top.lenconda.design_pattern.market.request;

import top.lenconda.design_pattern.market.user.User;

import java.util.Date;

public abstract class Request {
    public String id;
    public User creator;
    public String content;
    public RequestState state;
    public Date createDate;

    public Request(User creator) {
        this.state = new RunningRequestState(this);
        this.createDate = new Date();
        this.creator = creator;
    }
}
