package top.lenconda.design_pattern.market.request;

import top.lenconda.design_pattern.market.store.Goods;
import top.lenconda.design_pattern.market.user.User;

public class SupplyRequest extends Request {
    public SupplyRequest(User creator) {
        super(creator);
    }

    public Goods goods;
    public int quantity;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
