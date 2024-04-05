package com.etsy.android.lib.models;

import com.etsy.android.lib.models.apiv3.FormattedMoney;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ListingPromotion extends BaseFieldModel {
    public String mDescription = "";
    public String mDisclaimer = "";
    public FormattedMoney mDiscountDescripton;
    public boolean mHasMinimumCondition;
    public String mSellerDescription = "";

    public String getDescription() {
        return this.mDescription;
    }

    public String getDisclaimer() {
        return this.mDisclaimer;
    }

    public FormattedMoney getDiscountDescription() {
        return this.mDiscountDescripton;
    }

    public String getSellerDescription() {
        return this.mSellerDescription;
    }

    public boolean hasMinimumCondition() {
        return this.mHasMinimumCondition;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.DISCOUNT_DESCRIPTION.equals(str)) {
            this.mDiscountDescripton = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
            return false;
        } else if ("description".equals(str)) {
            this.mDescription = BaseModel.parseString(jsonParser);
            return false;
        } else if (ResponseConstants.DISCLAIMER.equals(str)) {
            this.mDisclaimer = BaseModel.parseString(jsonParser);
            return false;
        } else if (ResponseConstants.HAS_MINIMUM_CONDITION.equals(str)) {
            this.mHasMinimumCondition = jsonParser.getBooleanValue();
            return false;
        } else if (!ResponseConstants.SELLER_DESCRIPTION.equals(str)) {
            return false;
        } else {
            this.mSellerDescription = BaseModel.parseString(jsonParser);
            return false;
        }
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setDisclaimer(String str) {
        this.mDisclaimer = str;
    }

    public void setDiscountDescription(FormattedMoney formattedMoney) {
        this.mDiscountDescripton = formattedMoney;
    }

    public void setMinimumCondition(boolean z) {
        this.mHasMinimumCondition = z;
    }

    public void setSellerDescription(String str) {
        this.mSellerDescription = str;
    }
}
