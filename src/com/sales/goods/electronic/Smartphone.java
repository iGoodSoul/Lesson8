package com.sales.goods.electronic;

//TODO: finish
public class Smartphone extends Electronic{

    byte numberOfButtons;
    public Smartphone(long price, String description, Brand brand, byte numberOfButtons) {
        super(price, description, brand);
        this.numberOfButtons = numberOfButtons;
    }

    public byte getNumberOfButtons() {
        return numberOfButtons;
    }

    @Override
    public String toString() {
        return "com.sales.goods.electronic.Smartphone{" +
                "numberOfButtons=" + numberOfButtons +
                '}';
    }
}
