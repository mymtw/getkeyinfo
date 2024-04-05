package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class PromotionData extends BaseFieldModel {
    public boolean hasMinimum;
    public int minOrderItems;
    public int percentageDiscount;
    public long promotionId;

    public int getMinOrderItems() {
        return this.minOrderItems;
    }

    public int getPercentageDiscount() {
        return this.percentageDiscount;
    }

    public long getPromotionId() {
        return this.promotionId;
    }

    public boolean hasMinimum() {
        return this.hasMinimum;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("id".equals(str)) {
            this.promotionId = jsonParser.getValueAsLong();
            return true;
        } else if (ResponseConstants.HAS_MINIMUM.equals(str)) {
            this.hasMinimum = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.MIN_ORDER_ITEMS.equals(str)) {
            this.minOrderItems = jsonParser.getValueAsInt();
            return true;
        } else if (!ResponseConstants.PERCENTAGE_DISCOUNT.equals(str)) {
            return false;
        } else {
            this.percentageDiscount = jsonParser.getValueAsInt();
            return true;
        }
    }

    public void setHasMinimum(boolean z) {
        this.hasMinimum = z;
    }

    public void setMinOrderItems(int i) {
        this.minOrderItems = i;
    }

    public void setPercentageDiscount(int i) {
        this.percentageDiscount = i;
    }

    public void setPromotionId(long j) {
        this.promotionId = j;
    }
}
