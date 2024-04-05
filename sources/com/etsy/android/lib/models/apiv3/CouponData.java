package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class CouponData extends BaseFieldModel {
    public String mCouponCode = "";
    public boolean mIsValid;
    public FormattedMoney mMessage;
    public int mShopId;

    public String getCouponCode() {
        return this.mCouponCode;
    }

    public FormattedMoney getMessage() {
        return this.mMessage;
    }

    public int getShopId() {
        return this.mShopId;
    }

    public boolean isValid() {
        return this.mIsValid;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 126941351:
                if (str.equals(ResponseConstants.COUPON_IS_VALID)) {
                    c = 0;
                    break;
                }
                break;
            case 703898791:
                if (str.equals(ResponseConstants.COUPON_PROMOTION_NAME)) {
                    c = 1;
                    break;
                }
                break;
            case 954925063:
                if (str.equals("message")) {
                    c = 2;
                    break;
                }
                break;
            case 2067081988:
                if (str.equals("shop_id")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mIsValid = jsonParser.getBooleanValue();
                return true;
            case 1:
                this.mCouponCode = BaseModel.parseString(jsonParser);
                return true;
            case 2:
                this.mMessage = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
                return true;
            case 3:
                this.mShopId = jsonParser.getIntValue();
                return true;
            default:
                return false;
        }
    }
}
