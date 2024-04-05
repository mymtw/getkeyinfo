package com.etsy.android.lib.models.apiv3;

import android.annotation.SuppressLint;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.squareup.moshi.C17402n;
import java.io.IOException;
import java.util.Currency;
import org.apache.commons.lang3.StringUtils;

public class ShippingOption extends BaseModel {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final transient long serialVersionUID = -516362947511107555L;
    @C17402n(name = "cost")
    private long costAsAmountOfFraction;
    @C17402n(name = "currency_code")
    private String mCurrencyCode;
    @C17402n(name = "name")
    private String mName;
    @C17402n(name = "option_id")
    private String mOptionId;
    @C17402n(name = "option_type")
    private int mOptionType;

    static {
        Class<ShippingOption> cls = ShippingOption.class;
    }

    public ShippingOption() {
        this.mName = "";
        this.mOptionId = "";
        this.costAsAmountOfFraction = 1;
        this.mCurrencyCode = "USD";
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ShippingOption)) {
            return false;
        }
        return this.mOptionId.equals(((ShippingOption) obj).getOptionId());
    }

    public EtsyMoney getCost() {
        return StringUtils.equals(this.mCurrencyCode, "JPY") ? C8630b.f18964e.mo21249b(Currency.getInstance(this.mCurrencyCode), String.valueOf(this.costAsAmountOfFraction), 1) : C8630b.f18964e.mo21249b(Currency.getInstance(this.mCurrencyCode), String.valueOf(this.costAsAmountOfFraction), 100);
    }

    public String getCurrencyCode() {
        return this.mCurrencyCode;
    }

    public String getName() {
        return this.mName;
    }

    public String getOptionId() {
        return this.mOptionId;
    }

    public int getOptionType() {
        return this.mOptionType;
    }

    @SuppressLint({"Assert"})
    public int hashCode() {
        return 42;
    }

    public boolean isLocalDelivery() {
        return this.mOptionType == 5;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("name".equals(currentName)) {
                    this.mName = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.OPTION_ID.equals(currentName)) {
                    this.mOptionId = BaseModel.parseStringIdOrNumericValue(jsonParser);
                } else if (ResponseConstants.OPTION_TYPE.equals(currentName)) {
                    this.mOptionType = jsonParser.getValueAsInt();
                } else if (ResponseConstants.COST.equals(currentName)) {
                    this.costAsAmountOfFraction = jsonParser.getValueAsLong();
                } else if (ResponseConstants.CURRENCY_CODE.equals(currentName)) {
                    this.mCurrencyCode = BaseModel.parseString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public ShippingOption(String str, String str2, int i, long j, String str3) {
        this.mName = str;
        this.mOptionId = str2;
        this.mOptionType = i;
        this.costAsAmountOfFraction = j;
        this.mCurrencyCode = str3;
    }
}
