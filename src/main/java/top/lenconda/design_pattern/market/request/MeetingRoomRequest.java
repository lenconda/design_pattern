package top.lenconda.design_pattern.market.request;

import top.lenconda.design_pattern.market.user.User;

import java.util.Date;

public class MeetingRoomRequest extends Request {
    public MeetingRoomRequest(User creator) {
        super(creator);
    }

    public String location;
    public String title;
    public Date startDate;
    public Date endDate;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
