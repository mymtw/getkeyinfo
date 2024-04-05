package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OfferingUi extends BaseFieldModel {
    private static final long serialVersionUID = -6968719256342293496L;
    public FormattedMoney mDiscountDescription;
    public FormattedMoney mDiscountedPrice;
    public boolean mHasVariableQuantity = true;
    public FormattedMoney mPrice;
    public OfferingRangeSelect mQuantity;
    public List<OfferingSelect> mSelects = new ArrayList();
    public String mUnitPrice;

    public FormattedMoney getDiscountDescription() {
        return this.mDiscountDescription;
    }

    public FormattedMoney getDiscountedPrice() {
        return this.mDiscountedPrice;
    }

    public String getFormattedPrice() {
        FormattedMoney formattedMoney = this.mPrice;
        return formattedMoney != null ? formattedMoney.toString() : "";
    }

    public FormattedMoney getPrice() {
        return this.mPrice;
    }

    public OfferingRangeSelect getQuantity() {
        return this.mQuantity;
    }

    public List<OfferingSelect> getSelects() {
        return this.mSelects;
    }

    public String getUnitPrice() {
        return this.mUnitPrice;
    }

    public boolean hasVariableQuantity() {
        return this.mHasVariableQuantity;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2103078422:
                if (str.equals(ResponseConstants.DISCOUNTED_PRICE)) {
                    c = 0;
                    break;
                }
                break;
            case -1285004149:
                if (str.equals(ResponseConstants.QUANTITY)) {
                    c = 1;
                    break;
                }
                break;
            case -1035298679:
                if (str.equals(ResponseConstants.HAS_VARIABLE_QUANTITY)) {
                    c = 2;
                    break;
                }
                break;
            case -911770114:
                if (str.equals(ResponseConstants.DISCOUNT_DESCRIPTION)) {
                    c = 3;
                    break;
                }
                break;
            case 106934601:
                if (str.equals(ResponseConstants.PRICE)) {
                    c = 4;
                    break;
                }
                break;
            case 481263266:
                if (str.equals(ResponseConstants.UNIT_PRICE_STRING)) {
                    c = 5;
                    break;
                }
                break;
            case 1978100471:
                if (str.equals(ResponseConstants.SELECTS)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mDiscountedPrice = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
                break;
            case 1:
                this.mQuantity = (OfferingRangeSelect) BaseModel.parseObject(jsonParser, OfferingRangeSelect.class);
                break;
            case 2:
                this.mHasVariableQuantity = jsonParser.getValueAsBoolean();
                break;
            case 3:
                this.mDiscountDescription = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
                break;
            case 4:
                this.mPrice = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
                break;
            case 5:
                this.mUnitPrice = BaseModel.parseString(jsonParser);
                break;
            case 6:
                this.mSelects = BaseModel.parseArray(jsonParser, OfferingSelect.class);
                break;
            default:
                return false;
        }
        return true;
    }

    public void setDiscountDescription(FormattedMoney formattedMoney) {
        this.mDiscountDescription = formattedMoney;
    }

    public void setDiscountedPrice(FormattedMoney formattedMoney) {
        this.mDiscountedPrice = formattedMoney;
    }

    public void setHasVariableQuantity(boolean z) {
        this.mHasVariableQuantity = z;
    }

    public void setPrice(FormattedMoney formattedMoney) {
        this.mPrice = formattedMoney;
    }

    public void setQuantity(OfferingRangeSelect offeringRangeSelect) {
        this.mQuantity = offeringRangeSelect;
    }

    public void setSelects(List<OfferingSelect> list) {
        this.mSelects = list;
    }

    public void setUnitPrice(String str) {
        this.mUnitPrice = str;
    }
}
