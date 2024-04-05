package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Money;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class Promotion extends BaseFieldModel {
    public String mCode = "";
    public String mDescription = "";
    public Money mPrice;
    public Integer secondsUntilEnd;

    public String getCode() {
        return this.mCode;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public Money getPrice() {
        return this.mPrice;
    }

    public Integer getSecondsUntilEnd() {
        return this.secondsUntilEnd;
    }

    public int getViewType() {
        return R.id.view_type_promotion;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.PRICE.equals(str)) {
            this.mPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        } else if ("description".equals(str)) {
            this.mDescription = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.CODE.equals(str)) {
            this.mCode = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.PROMOTION_SECONDS_UNTIL_END.equals(str)) {
            return false;
        } else {
            this.secondsUntilEnd = Integer.valueOf(jsonParser.getIntValue());
            return true;
        }
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setSecondsUntilEnd(Integer num) {
        this.secondsUntilEnd = num;
    }
}
