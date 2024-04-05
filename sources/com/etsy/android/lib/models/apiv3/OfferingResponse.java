package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.Nudge;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class OfferingResponse extends BaseFieldModel {
    private static final long serialVersionUID = 8693379461099167307L;
    public Money mMaxPrice;
    public int mMaxQuantity;
    public Money mMinPrice;
    public int mMinQuantity;
    public Nudge mNudge;
    public Offering mOffering;
    public OfferingUi mUi;

    public Money getMaxPrice() {
        return this.mMaxPrice;
    }

    public int getMaxQuantity() {
        return this.mMaxQuantity;
    }

    public Money getMinPrice() {
        return this.mMinPrice;
    }

    public int getMinQuantity() {
        return this.mMinQuantity;
    }

    public Nudge getNudge() {
        return this.mNudge;
    }

    public Offering getOffering() {
        return this.mOffering;
    }

    public OfferingUi getUi() {
        return this.mUi;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -768536570:
                if (str.equals(ResponseConstants.OFFERING)) {
                    c = 0;
                    break;
                }
                break;
            case -326778618:
                if (str.equals(ResponseConstants.MAX_QUANTITY)) {
                    c = 1;
                    break;
                }
                break;
            case -237166930:
                if (str.equals(ResponseConstants.MAX_PRICE)) {
                    c = 2;
                    break;
                }
                break;
            case 3732:
                if (str.equals(ResponseConstants.f19137UI)) {
                    c = 3;
                    break;
                }
                break;
            case 105172251:
                if (str.equals(ResponseConstants.NUDGE)) {
                    c = 4;
                    break;
                }
                break;
            case 147647448:
                if (str.equals(ResponseConstants.MIN_QUANTITY)) {
                    c = 5;
                    break;
                }
                break;
            case 535311644:
                if (str.equals(ResponseConstants.MIN_PRICE)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mOffering = (Offering) BaseModel.parseObject(jsonParser, Offering.class);
                break;
            case 1:
                this.mMaxQuantity = jsonParser.getValueAsInt();
                break;
            case 2:
                this.mMaxPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
                break;
            case 3:
                this.mUi = (OfferingUi) BaseModel.parseObject(jsonParser, OfferingUi.class);
                break;
            case 4:
                this.mNudge = (Nudge) BaseModel.parseObject(jsonParser, Nudge.class);
                break;
            case 5:
                this.mMinQuantity = jsonParser.getValueAsInt();
                break;
            case 6:
                this.mMinPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
                break;
            default:
                return false;
        }
        return true;
    }

    public void setMaxPrice(Money money) {
        this.mMaxPrice = money;
    }

    public void setMaxQuantity(int i) {
        this.mMaxQuantity = i;
    }

    public void setMinPrice(Money money) {
        this.mMinPrice = money;
    }

    public void setMinQuantity(int i) {
        this.mMinQuantity = i;
    }

    public void setNudge(Nudge nudge) {
        this.mNudge = nudge;
    }

    public void setOffering(Offering offering) {
        this.mOffering = offering;
    }

    public void setUi(OfferingUi offeringUi) {
        this.mUi = offeringUi;
    }
}
