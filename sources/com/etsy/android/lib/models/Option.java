package com.etsy.android.lib.models;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;

public class Option extends BaseModel {
    public static final long serialVersionUID = -6056371838306858721L;
    public EtsyMoney mConvertedPrice = C8630b.f18964e.mo21250c();
    public String mFormattedValue = "";
    public boolean mIsAvailable;
    public EtsyMoney mPrice = C8630b.f18964e.mo21250c();
    public EtsyMoney mPriceDiff = C8630b.f18964e.mo21250c();
    public long mValueId;
    public long mVariationPropertyId;

    public EtsyMoney getConvertedPrice() {
        return this.mConvertedPrice;
    }

    public String getFormattedValue() {
        return this.mFormattedValue;
    }

    public EtsyMoney getPrice() {
        return this.mPrice;
    }

    public long getValueId() {
        return this.mValueId;
    }

    public long getVariationPropertyId() {
        return this.mVariationPropertyId;
    }

    public boolean hasPriceDiff() {
        return this.mPriceDiff.getAmount().compareTo(new BigDecimal(0)) == 1;
    }

    public boolean isAvailable() {
        return this.mIsAvailable;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.VALUE_ID.equals(currentName)) {
                    this.mValueId = jsonParser.getValueAsLong();
                } else if ("formatted_value".equals(currentName)) {
                    this.mFormattedValue = BaseModel.parseString(jsonParser);
                } else if ("is_available".equals(currentName)) {
                    this.mIsAvailable = jsonParser.getValueAsBoolean(false);
                } else if (ResponseConstants.PRICE.equals(currentName)) {
                    this.mPrice = this.mPrice.withAmount(BaseModel.parseString(jsonParser));
                } else if ("price_diff".equals(currentName)) {
                    this.mPriceDiff = this.mPriceDiff.withAmount(BaseModel.parseString(jsonParser));
                } else if (ResponseConstants.CONVERTED_PRICE.equals(currentName)) {
                    this.mConvertedPrice = this.mConvertedPrice.withAmount(BaseModel.parseString(jsonParser));
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setAvailable(boolean z) {
        this.mIsAvailable = z;
    }

    public void setConvertedPrice(EtsyMoney etsyMoney) {
        this.mConvertedPrice = etsyMoney;
    }

    public void setFormattedValue(String str) {
        this.mFormattedValue = str;
    }

    public void setPrice(EtsyMoney etsyMoney) {
        this.mPrice = etsyMoney;
    }

    public void setPriceDiff(EtsyMoney etsyMoney) {
        this.mPriceDiff = etsyMoney;
    }

    public void setValueId(long j) {
        this.mValueId = j;
    }

    public void setVariationPropertyId(long j) {
        this.mVariationPropertyId = j;
    }

    public String toString() {
        return getFormattedValue();
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.OPTION_VALUE_ID, Long.valueOf(this.mValueId));
        return hashMap;
    }
}
