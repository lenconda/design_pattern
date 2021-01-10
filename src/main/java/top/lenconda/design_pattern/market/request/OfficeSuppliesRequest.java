package top.lenconda.design_pattern.market.request;

import top.lenconda.design_pattern.market.user.User;

public class OfficeSuppliesRequest extends Request {
    public OfficeSuppliesRequest(User creator) {
        super(creator);
    }

    public String suppliesName;
    public int quantity;

    public void setSuppliesName(String suppliesName) {
        this.suppliesName = suppliesName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
