package top.lenconda.design_pattern.market.transaction;

import top.lenconda.design_pattern.market.user.User;

public class HoldMeetingTransaction extends Transaction {
    public HoldMeetingTransaction(User invoker) {
        super(invoker, "HoldMeeting");
    }

    public void execute() {
        for (User receiver : receivers) {
            receiver.approveTransaction(this);
        }
    }
}
