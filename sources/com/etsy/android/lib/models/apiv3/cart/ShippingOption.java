package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FormattedMoney;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ShippingOption extends BaseFieldModel {
    private static final String OPTION_NAME = "option_name";
    private static final long serialVersionUID = -5096706812116398703L;
    public String mEstimatedDeliveryDate;
    public FormattedMoney mFormattedMoney;
    public String mOptionId;
    public String nameWithoutPrice;

    public String getEstimatedDeliveryDate() {
        return this.mEstimatedDeliveryDate;
    }

    public FormattedMoney getFormattedMoney() {
        return this.mFormattedMoney;
    }

    public String getNameWithoutPrice() {
        return this.nameWithoutPrice;
    }

    public String getOptionId() {
        return this.mOptionId;
    }

    public String getTitle() {
        FormattedMoney formattedMoney = this.mFormattedMoney;
        return formattedMoney != null ? formattedMoney.toString() : "";
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.OPTION_ID.equals(str)) {
            this.mOptionId = BaseModel.parseStringIdOrNumericValue(jsonParser);
            return false;
        } else if (ResponseConstants.FORMATTED_MONEY.equals(str)) {
            this.mFormattedMoney = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
            return false;
        } else if (ResponseConstants.SECONDARY_TEXT.equals(str)) {
            this.mEstimatedDeliveryDate = BaseModel.parseString(jsonParser);
            return false;
        } else if (!OPTION_NAME.equals(str)) {
            return false;
        } else {
            this.nameWithoutPrice = BaseModel.parseString(jsonParser);
            return false;
        }
    }

    public String toString() {
        String str = this.nameWithoutPrice;
        return str != null ? str : getTitle();
    }
}
