package com.etsy.android.lib.models;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class Coupon extends BaseModel {
    public static final String TYPE_FIXED_DISCOUNT = "fixed_discount";
    public static final String TYPE_FREE_SHIPPING = "free_shipping";
    public static final String TYPE_IPP_FIXED_DISCOUNT = "ipp_fixed_discount";
    public static final String TYPE_IPP_PERCENT_DISCOUNT = "ipp_percent_discount";
    public static final String TYPE_PERCENT_DISCOUNT = "pct_discount";
    private static final long serialVersionUID = 7153533561895263275L;
    public String mCouponCode = "";
    public String mCouponDescription = "";
    public String mCouponId = "";
    public String mCurrencyCode = "";
    public long mExpirationDate = 0;
    public String mFixedDiscount = "";
    public boolean mFreeShipping;
    public boolean mIsIPPEligible = false;
    public String mMinimumPurchasePrice = "";
    public int mPercentDiscount;
    public String mType = "";

    public String getCouponCode() {
        return this.mCouponCode;
    }

    public String getCouponDescription() {
        return this.mCouponDescription;
    }

    public String getCouponId() {
        return this.mCouponId;
    }

    public long getExpirationDate() {
        return this.mExpirationDate;
    }

    public String getFixedDiscount() {
        return this.mFixedDiscount;
    }

    public String getFormattedFixedDiscount() {
        return C8630b.f18964e.mo21248a(this.mFixedDiscount, this.mCurrencyCode).format();
    }

    public String getMinimumPurchasePrice() {
        return this.mMinimumPurchasePrice;
    }

    public int getPercentDiscount() {
        return this.mPercentDiscount;
    }

    public String getType() {
        return this.mType;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() <= this.mExpirationDate;
    }

    public boolean isFixedDiscount() {
        return TYPE_FIXED_DISCOUNT.equalsIgnoreCase(this.mType) || C8885d0.m17324h(this.mFixedDiscount);
    }

    public boolean isFreeShipping() {
        return "free_shipping".equalsIgnoreCase(this.mType) || this.mFreeShipping;
    }

    public boolean isIsIPPEligible() {
        return this.mIsIPPEligible;
    }

    public boolean isPercentDiscount() {
        return TYPE_PERCENT_DISCOUNT.equalsIgnoreCase(this.mType) || this.mPercentDiscount > 0;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("coupon_code".equals(currentName)) {
                    this.mCouponCode = BaseModel.parseString(jsonParser);
                } else if (TYPE_PERCENT_DISCOUNT.equals(currentName)) {
                    this.mPercentDiscount = jsonParser.getValueAsInt();
                } else if ("free_shipping".equals(currentName)) {
                    boolean z = true;
                    if (jsonParser.getValueAsInt() != 1) {
                        z = false;
                    }
                    this.mFreeShipping = z;
                } else if (ResponseConstants.CURRENCY_CODE.equals(currentName)) {
                    this.mCurrencyCode = BaseModel.parseString(jsonParser);
                } else if (TYPE_FIXED_DISCOUNT.equals(currentName)) {
                    this.mFixedDiscount = BaseModel.parseString(jsonParser);
                } else if ("coupon_type".equals(currentName)) {
                    this.mType = BaseModel.parseString(jsonParser);
                } else if ("coupon_id".equals(currentName)) {
                    this.mCouponId = BaseModel.parseString(jsonParser);
                } else if ("expiration_date".equals(currentName)) {
                    this.mExpirationDate = jsonParser.getLongValue();
                } else if ("is_ipp_eligible".equals(currentName)) {
                    this.mIsIPPEligible = jsonParser.getBooleanValue();
                } else if ("coupon_description".equals(currentName)) {
                    this.mCouponDescription = BaseModel.parseString(jsonParser);
                } else if ("minimum_purchase_price".equals(currentName)) {
                    this.mMinimumPurchasePrice = BaseModel.parseString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setFixedDiscount(String str) {
        this.mFixedDiscount = str;
    }

    public void setMinimumPurchasePrice(String str) {
        this.mMinimumPurchasePrice = str;
    }

    public void setPercentDiscount(int i) {
        this.mPercentDiscount = i;
    }

    public void setType(String str) {
        this.mType = str;
    }
}
