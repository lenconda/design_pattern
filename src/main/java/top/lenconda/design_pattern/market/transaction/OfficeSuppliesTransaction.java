package top.lenconda.design_pattern.market.transaction;

import top.lenconda.design_pattern.market.user.User;

public class OfficeSuppliesTransaction extends Transaction {
    public OfficeSuppliesTransaction(User invoker) {
        super(invoker, "OfficeSupplies");
    }

    public void execute() {
        for (User receiver : receivers) {
            receiver.approveTransaction(this);
        }
    }
}
