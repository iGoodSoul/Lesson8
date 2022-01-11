package com.sales.shop.offline;

import com.sales.goods.Goods;
import com.sales.goods.food.Apple;
import com.sales.goods.food.Bread;
import com.sales.goods.food.Milk;
import com.sales.shop.Selling;

public class Supermarket implements Selling {
    private static final int ARRAY_SIZE = 5;

    private final Apple[] appleStorage;
    private final Bread[] breadStorage;
    private final Milk[] milkStorage;

    private int currentIndexApple;
    private int currentIndexBread;
    private int currentIndexMilk;

    private long commonSumma;

    public Supermarket() {
        appleStorage = new Apple[ARRAY_SIZE];
        breadStorage = new Bread[ARRAY_SIZE];
        milkStorage = new Milk[ARRAY_SIZE];
        currentIndexApple = 0;
        currentIndexBread = 0;
        currentIndexMilk = 0;
    }

    @Override
    public boolean addNewGoods(Goods goods) {
        boolean wasAdded = false;
        if (goods instanceof Apple && currentIndexApple < ARRAY_SIZE) {
            appleStorage[currentIndexApple++] = (Apple) goods;
            wasAdded = true;
        }
        if (goods instanceof Bread && currentIndexBread < ARRAY_SIZE) {
            breadStorage[currentIndexBread++] = (Bread) goods;
            wasAdded = true;
        }
        if (goods instanceof Milk && currentIndexMilk < ARRAY_SIZE) {
            milkStorage[currentIndexMilk++] = (Milk) goods;
            wasAdded = true;
        }
        if (wasAdded) {
            commonSumma += goods.getPrice();
        }
        return wasAdded;
    }

    @Override
    public long commonPrice() {
        if (commonSumma != 0) {
            return commonSumma;
        }
        for (int i = 0; i < currentIndexApple; i++) {
            commonSumma += appleStorage[i].getPrice();
        }
        for (int i = 0; i < currentIndexBread; i++) {
            commonSumma += breadStorage[i].getPrice();
        }
        for (int i = 0; i < currentIndexMilk; i++) {
            commonSumma += milkStorage[i].getPrice();
        }
        return commonSumma;
    }

    @Override
    public void printGoodsDescription() {
        for (int i = 0; i < currentIndexApple; i++) {
            System.out.println(appleStorage[i].getDescription());
        }
        for (int i = 0; i < currentIndexBread; i++) {
            System.out.println(breadStorage[i].getDescription());
        }
        for (int i = 0; i < currentIndexMilk; i++) {
            System.out.println(milkStorage[i].getDescription());
        }
    }

    @Override
    public boolean buy(Goods goods) {
        boolean wasRemoved = false;
        if (goods instanceof Apple) {
            int index = find(appleStorage, currentIndexApple, goods);
            if (index < 0) {
                return false;
            }
            remove(appleStorage, currentIndexApple, index);
            currentIndexApple--;
            wasRemoved = true;
        }
        if (goods instanceof Bread) {
            int index = find(breadStorage, currentIndexBread, goods);
            if (index < 0) {
                return false;
            }
            remove(breadStorage, currentIndexBread, index);
            currentIndexBread--;
            wasRemoved = true;
        }
        if (goods instanceof Milk) {
            int index = find(milkStorage, currentIndexMilk, goods);
            if (index < 0) {
                return false;
            }
            remove(milkStorage, currentIndexMilk, index);
            currentIndexMilk--;
            wasRemoved = true;
        }
        if (wasRemoved) {
            commonSumma -= goods.getPrice();
        }
        return wasRemoved;
    }

    private int find(Goods[] storage, int currentIndex, Goods goods) {
        for (int i = 0; i < currentIndex; i++) {
            if (storage[i].equals(goods)) {
                return i;
            }
        }
        return -1;
    }

    private void remove(Goods[] storage, int currentIndex, int index) {
        storage[index] = storage[currentIndex - 1];
        storage[currentIndex - 1] = null;
    }
}
