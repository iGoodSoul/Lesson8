package com.sales.goods;

import java.util.Objects;

public abstract class Goods {
    private static long idCounter = 1;

    private final long id;

    private long price;
    private String description;

    public Goods(long price, String description) {
        this.price = price;
        this.description = description;
        this.id = idCounter++;

    }

    public long getId() {
        return id;
    }

    public long getPrice() {
        return price;
    }

    public String getDescription() {
        return description + this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return id == goods.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
