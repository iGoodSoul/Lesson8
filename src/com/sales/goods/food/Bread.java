package com.sales.goods.food;

import com.sales.goods.Goods;

public class Bread extends Goods {
    private String type;

    public Bread(long price, String description, String type) {
        super(price, description);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "type=" + type;
    }
}
