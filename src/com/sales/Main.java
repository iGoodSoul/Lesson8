package com.sales;

import com.sales.goods.electronic.Laptop;
import com.sales.goods.electronic.Smartphone;
import com.sales.shop.Selling;
import com.sales.shop.online.EShop;
import com.sales.tax.Tax;

public class Main {

    public static void main(String[] args) {
        EShop eShop1 = new EShop();

        Laptop[] laptopStorage = new Laptop[5];
        laptopStorage[0] = new Laptop(2000,"new", Laptop.Brand.APPLE, (byte) 13);
        laptopStorage[1] = new Laptop(3000,"new", Laptop.Brand.XIAOMI, (byte) 15);
        laptopStorage[2] = new Laptop(1500,"new", Laptop.Brand.ZTE, (byte) 14);
        laptopStorage[3] = new Laptop(1300,"used", Laptop.Brand.APPLE, (byte) 13);
        laptopStorage[4] = new Laptop(2000,"used", Laptop.Brand.SAMSUNG, (byte) 17);

       eShop1.addNewGoods(laptopStorage[0]);
        eShop1.addNewGoods(laptopStorage[1]);
        eShop1.addNewGoods(laptopStorage[2]);
        eShop1.addNewGoods(laptopStorage[3]);
        eShop1.addNewGoods(laptopStorage[4]);



        Smartphone[] smartphoneStorage = new Smartphone[5];
        smartphoneStorage[0] = new Smartphone(2000,"new", Smartphone.OS.ANDROID, Smartphone.Brand.SAMSUNG);
        smartphoneStorage[1] = new Smartphone(1500,"new", Smartphone.OS.ANDROID, Smartphone.Brand.XIAOMI);
        smartphoneStorage[2] = new Smartphone(1300,"new", Smartphone.OS.ANDROID, Smartphone.Brand.HUAWEI);
        smartphoneStorage[3] = new Smartphone(1200,"new", Smartphone.OS.ANDROID, Smartphone.Brand.ZTE);
        smartphoneStorage[4] = new Smartphone(3000,"new", Smartphone.OS.ANDROID, Smartphone.Brand.APPLE);


        eShop1.addNewGoods(smartphoneStorage[0]);
        eShop1.addNewGoods(smartphoneStorage[0]);
        eShop1.addNewGoods(smartphoneStorage[0]);
        eShop1.addNewGoods(smartphoneStorage[0]);
        eShop1.addNewGoods(smartphoneStorage[0]);



        System.out.println(Tax.calcDamagesDuringDestroy(eShop1));

    }
}
