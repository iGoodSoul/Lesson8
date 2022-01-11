package com.sales.goods.food;

import com.sales.goods.Goods;

import java.time.ZonedDateTime;

public class Milk extends Goods {
    private ZonedDateTime expirationDate;

    public Milk(long price, String description) {
        super(price, description);
    }

    public ZonedDateTime getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "expirationDate=" + expirationDate;
    }
}
