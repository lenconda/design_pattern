package top.lenconda.design_pattern.market.request;

import top.lenconda.design_pattern.market.user.User;

public class SupplyRequest extends Request {
    public SupplyRequest(User creator) {
        super(creator);
    }
}
