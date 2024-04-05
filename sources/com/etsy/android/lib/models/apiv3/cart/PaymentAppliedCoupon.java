package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FormattedMoney;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class PaymentAppliedCoupon extends BaseFieldModel {
    public String mCouponCode;
    public String mDescription;
    public FormattedMoney mDiscountAmount;

    public String getCouponCode() {
        return this.mCouponCode;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getDiscountAmountString() {
        FormattedMoney formattedMoney = this.mDiscountAmount;
        return formattedMoney != null ? formattedMoney.toString() : "";
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("description".equals(str)) {
            this.mDescription = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.CODE.equals(str)) {
            this.mCouponCode = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.DISCOUNT_AMOUNT.equals(str)) {
            return false;
        } else {
            this.mDiscountAmount = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
            return true;
        }
    }
}
