package top.lenconda.design_pattern.market.transaction;

import top.lenconda.design_pattern.market.user.User;

public class MeetingRoomTransaction extends Transaction {
    public MeetingRoomTransaction(User invoker) {
        super(invoker, "MeetingRoom");
    }

    public void execute() {
        for (User receiver : receivers) {
            receiver.approveTransaction(this);
        }
    }
}
