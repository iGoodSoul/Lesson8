package com.sales.goods.food;

import com.sales.goods.Goods;

public class Apple extends Goods {
    private String color;

    public Apple(long price, String description, String color) {
        super(price, description);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "color=" + color;
    }
}
