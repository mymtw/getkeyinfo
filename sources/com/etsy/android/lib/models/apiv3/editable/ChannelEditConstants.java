package com.etsy.android.lib.models.apiv3.editable;

import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.math.BigDecimal;

public class ChannelEditConstants extends BaseFieldModel {
    private static final long serialVersionUID = 2880442517506324890L;
    public Money mMaximumProductPrice;
    public EtsyMoney mMaximumProductPriceEtsyMoney;
    public long mMaximumProductQuantity;
    public String mMaximumQuantityConstraintMessage;
    public Money mMinimumProductPrice;
    public EtsyMoney mMinimumProductPriceEtsyMoney;
    public String mPriceConstraintMessage;
    public EtsyId mSalesChannelId = new EtsyId();
    public String mSingleProductQuantityConstraintMessage;

    private static EtsyMoney etsyMoneyFromMoney(Money money) {
        return money.asEtsyMoney().constrainAmountToCurrencyFractionalDigits();
    }

    public Money getMaximumProductPrice() {
        return this.mMaximumProductPrice;
    }

    public BigDecimal getMaximumProductPriceAmount() {
        return getMaximumProductPriceAsEtsyMoney().getAmount();
    }

    public EtsyMoney getMaximumProductPriceAsEtsyMoney() {
        if (this.mMaximumProductPriceEtsyMoney == null) {
            this.mMaximumProductPriceEtsyMoney = etsyMoneyFromMoney(this.mMaximumProductPrice);
        }
        return this.mMaximumProductPriceEtsyMoney;
    }

    public long getMaximumProductQuantity() {
        return this.mMaximumProductQuantity;
    }

    public Money getMinimumProductPrice() {
        return this.mMinimumProductPrice;
    }

    public BigDecimal getMinimumProductPriceAmount() {
        return getMinimumProductPriceAsEtsyMoney().getAmount();
    }

    public EtsyMoney getMinimumProductPriceAsEtsyMoney() {
        if (this.mMinimumProductPriceEtsyMoney == null) {
            this.mMinimumProductPriceEtsyMoney = etsyMoneyFromMoney(this.mMinimumProductPrice);
        }
        return this.mMinimumProductPriceEtsyMoney;
    }

    public EtsyId getSalesChannelId() {
        return this.mSalesChannelId;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.SALES_CHANNEL_ID.equals(str)) {
            this.mSalesChannelId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.MAXIMUM_PRODUCT_QUANTITY.equals(str)) {
            this.mMaximumProductQuantity = jsonParser.getValueAsLong();
            return true;
        } else if (ResponseConstants.MINIMUM_PRODUCT_PRICE.equals(str)) {
            this.mMinimumProductPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        } else if (!ResponseConstants.MAXIMUM_PRODUCT_PRICE.equals(str)) {
            return false;
        } else {
            this.mMaximumProductPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        }
    }
}
