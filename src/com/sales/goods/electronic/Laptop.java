package com.sales.goods.electronic;

//TODO: finish
public class Laptop extends Electronic {


    byte displaySize;
    public Laptop(long price, String description, Brand brand, byte displaySize) {
        super(price, description, brand);
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
