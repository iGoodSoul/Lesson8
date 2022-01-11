package com.sales.shop.offline;

import com.sales.goods.Goods;
import com.sales.goods.medical.Drug;
import com.sales.shop.Selling;

public class Pharmacy implements Selling {
    private static final int ARRAY_SIZE = 10;

    private Drug[] storage;
    private int currentIndex;

    public Pharmacy() {
        this.storage = new Drug[ARRAY_SIZE];
        currentIndex = 0;
    }


    @Override
    public boolean addNewGoods(Goods goods) {
        if (currentIndex >= ARRAY_SIZE || !(goods instanceof Drug)) {
            return false;
        }
        storage[currentIndex++] = (Drug) goods;
        return true;
    }

    @Override
    public long commonPrice() {
        long summa = 0;
        for (int i = 0; i < currentIndex; i++) {
            summa += storage[i].getPrice();
        }
        return summa;
    }

    @Override
    public void printGoodsDescription() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(storage[i].getDescription());
        }
    }

    @Override
    public boolean buy(Goods goods) {
        for (int i = 0; i < currentIndex; i++) {
            if (storage[i].equals(goods)) {
                if (i + 1 != currentIndex) {
                    storage[i] = storage[currentIndex - 1];
                }
                storage[currentIndex - 1] = null;
                currentIndex--;
                return true;
            }
        }
        return false;
    }
}
