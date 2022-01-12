package com.sales.goods.electronic;

import com.sales.goods.Goods;

public abstract class Electronic extends Goods {


    private final Brand brand;

    public enum Brand{
        SAMSUNG,
        APPLE,
        HUAWEI,
        ZTE,
        XIAOMI


    }



    public Electronic(long price, String description,Brand brand) {
        super(price, description);
        this.brand = brand;

    }
}
