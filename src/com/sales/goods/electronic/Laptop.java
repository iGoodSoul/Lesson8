package com.sales.goods.electronic;

import com.sales.goods.Goods;

//TODO: finish
public class Laptop extends Goods {
    private final Brand brand;
    byte displaySize;

    public enum Brand {
        SAMSUNG,
        APPLE,
        HUAWEI,
        ZTE,
        XIAOMI
    }


    public Laptop(long price, String description, Brand brand, byte displaySize) {
        super(price, description);
        this.brand = brand;
        this.displaySize = displaySize;
    }

    public byte getDisplaySize() {
        return displaySize;
    }
    @Override
    public String toString() {
        return "com.sales.goods.electronic.Laptop{" +
                "displaySize=" + displaySize +
                '}';
    }
}