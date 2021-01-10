package top.lenconda.design_pattern.market.store;

import top.lenconda.design_pattern.market.user.User;

import java.util.ArrayList;

public class Store {
    private ArrayList<Goods> goods;

    public void setGoods(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    public ArrayList<Goods> getGoods() {
        return goods;
    }

    public void saleGoods(Goods goods, int count, User operator) {
        goods.sale(goods.getQuantity() - count, operator);
    }
}
