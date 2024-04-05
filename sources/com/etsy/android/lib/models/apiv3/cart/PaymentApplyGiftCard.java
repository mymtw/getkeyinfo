package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Money;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class PaymentApplyGiftCard extends BaseFieldModel {
    private static final long serialVersionUID = 9035902034254346450L;
    public boolean mIsApplied;
    public Money mMoney;
    public String mSubText;
    public String mTitle = "";

    public String getMoneyString() {
        Money money = this.mMoney;
        return money != null ? money.toString() : "";
    }

    public String getSubText() {
        return this.mSubText;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isApplied() {
        return this.mIsApplied;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.MONEY.equals(str)) {
            this.mMoney = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        } else if (ResponseConstants.IS_APPLIED.equals(str)) {
            this.mIsApplied = jsonParser.getBooleanValue();
            return true;
        } else if (!ResponseConstants.SUBTEXT.equals(str)) {
            return false;
        } else {
            this.mSubText = BaseModel.parseString(jsonParser);
            return true;
        }
    }
}
