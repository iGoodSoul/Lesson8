package com.sales.shop;

import com.sales.goods.Goods;

public interface Selling {
    boolean addNewGoods(Goods goods);
    long commonPrice();
    void printGoodsDescription();
    boolean buy(Goods goods);
}
