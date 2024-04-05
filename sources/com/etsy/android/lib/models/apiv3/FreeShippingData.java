package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class FreeShippingData extends BaseFieldModel {
    private static final long serialVersionUID = -2309095211394144023L;
    public String freeShippingCopy = "";
    private boolean hasFreeShipping = false;
    private boolean hasMinimum = false;
    private boolean isBuyerPromiseEligible = false;
    private long promotionId;

    public String getFreeShippingCopy() {
        return this.freeShippingCopy;
    }

    public boolean getHasFreeShipping() {
        return this.hasFreeShipping;
    }

    public boolean getHasMinumim() {
        return this.hasMinimum;
    }

    public long getPromotionId() {
        return this.promotionId;
    }

    public boolean isBuyerPromiseEligible() {
        return this.isBuyerPromiseEligible;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1584651565:
                if (str.equals(ResponseConstants.FREE_SHIPPING_COPY)) {
                    c = 0;
                    break;
                }
                break;
            case -414564036:
                if (str.equals(ResponseConstants.HAS_FREE_SHIPPING)) {
                    c = 1;
                    break;
                }
                break;
            case -181469124:
                if (str.equals(ResponseConstants.IS_BUYER_PROMISE_ELIGIBLE)) {
                    c = 2;
                    break;
                }
                break;
            case 697273133:
                if (str.equals(ResponseConstants.FREE_SHIPPING_MINIMUM)) {
                    c = 3;
                    break;
                }
                break;
            case 1962741303:
                if (str.equals("promotion_id")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.freeShippingCopy = BaseModel.parseString(jsonParser);
                break;
            case 1:
                this.hasFreeShipping = jsonParser.getValueAsBoolean();
                break;
            case 2:
                this.isBuyerPromiseEligible = jsonParser.getValueAsBoolean();
                break;
            case 3:
                this.hasMinimum = jsonParser.getValueAsBoolean();
                break;
            case 4:
                this.promotionId = jsonParser.getValueAsLong();
                break;
            default:
                return false;
        }
        return true;
    }

    public void setBuyerPromiseEligible(boolean z) {
        this.isBuyerPromiseEligible = z;
    }

    public void setFreeShippingCopy(String str) {
        this.freeShippingCopy = str;
    }

    public void setHasFreeShipping(boolean z) {
        this.hasFreeShipping = z;
    }

    public void setHasMinimum(boolean z) {
        this.hasMinimum = z;
    }

    public void setPromotionId(long j) {
        this.promotionId = j;
    }
}
