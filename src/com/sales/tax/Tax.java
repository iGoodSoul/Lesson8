package com.sales.tax;

import com.sales.shop.Selling;

public class Tax {
    public static long calcDamagesDuringDestroy(Selling selling) {
        return selling.commonPrice();
    }
}
