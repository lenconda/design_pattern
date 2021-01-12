package top.lenconda.design_pattern.market.transaction;

import top.lenconda.design_pattern.market.user.User;

public class HolidayTransaction extends Transaction {
    public HolidayTransaction(User invoker) {
        super(invoker, "Holiday");
    }

    public void execute() {
        for (User receiver : receivers) {
            receiver.approveTransaction(this);
        }
    }
}
