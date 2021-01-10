package top.lenconda.design_pattern.market.request;

import top.lenconda.design_pattern.market.user.User;

import java.util.Date;

public class HolidayRequest extends Request {
    public HolidayRequest(User creator) {
        super(creator);
    }

    public User targetUser;
    public Date startDate;
    public Date endDate;

    public void setTargetUser(User targetUser) {
        this.targetUser = targetUser;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
