package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class Promotion extends BaseFieldModel {
    private int minNumOrderItems;
    private int minOrderPrice;
    private EtsyMoney minOrderPriceMoney;
    public long promotionEnd;
    public long promotionId;

    public int getMinNumOrderItems() {
        return this.minNumOrderItems;
    }

    public int getMinOrderPrice() {
        return this.minOrderPrice;
    }

    public EtsyMoney getMinOrderPriceMoney() {
        return this.minOrderPriceMoney;
    }

    public long getPromotionEnd() {
        return this.promotionEnd;
    }

    public long getPromotionId() {
        return this.promotionId;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1290829141:
                if (str.equals(ResponseConstants.MIN_ORDER_PRICE)) {
                    c = 0;
                    break;
                }
                break;
            case -738190804:
                if (str.equals(ResponseConstants.MIN_ORDER_PRICE_MONEY)) {
                    c = 1;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c = 2;
                    break;
                }
                break;
            case 100571:
                if (str.equals(ResponseConstants.PROMOTION_END)) {
                    c = 3;
                    break;
                }
                break;
            case 1139517545:
                if (str.equals(ResponseConstants.MIN_NUM_ORDER_ITEMS)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.minOrderPrice = jsonParser.getValueAsInt();
                break;
            case 1:
                Money money = (Money) BaseModel.parseObject(jsonParser, Money.class);
                if (money != null) {
                    this.minOrderPriceMoney = money.asEtsyMoney();
                    break;
                }
                break;
            case 2:
                this.promotionId = jsonParser.getValueAsLong();
                break;
            case 3:
                this.promotionEnd = jsonParser.getValueAsLong();
                break;
            case 4:
                this.minNumOrderItems = jsonParser.getValueAsInt();
                break;
            default:
                return false;
        }
        return true;
    }

    public void setMinNumOrderItems(int i) {
        this.minNumOrderItems = i;
    }

    public void setMinOrderPrice(int i) {
        this.minOrderPrice = i;
    }

    public void setMinOrderPriceMoney(EtsyMoney etsyMoney) {
        this.minOrderPriceMoney = etsyMoney;
    }

    public void setPromotionEnd(long j) {
        this.promotionEnd = j;
    }

    public void setPromotionId(long j) {
        this.promotionId = j;
    }
}
