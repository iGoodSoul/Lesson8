package com.sales.goods.medical;

import com.sales.goods.Goods;

public class Drug extends Goods {
    private boolean receiptRequire;

    public Drug(long price, String description, boolean receiptRequire) {
        super(price, description);
        this.receiptRequire = receiptRequire;
    }

    public boolean isReceiptRequire() {
        return receiptRequire;
    }

    @Override
    public String toString() {
        return "receiptRequire=" + receiptRequire;
    }
}
