package com.sales.goods.electronic;

import com.sales.goods.Goods;



//TODO: finish
public class Smartphone extends Goods {
    private final Brand brand;
    private final OS os;

    public enum Brand {
        SAMSUNG,
        APPLE,
        HUAWEI,
        ZTE,
        XIAOMI
    }
    public enum OS {
        ANDROID,
        IOS,
        WINDOWS
    }

    public Smartphone(long price, String description, OS os, Brand brand) {
        super(price, description);
        this.brand = brand;
        this.os = os;
    }

    public OS getOs() {
        return os;
    }

    @Override
    public String toString() {
        return "com.sales.goods.electronic.Smartphone{" +
                "os=" + os +
                '}';
    }
}

