package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import org.apache.commons.lang3.ObjectUtils;

public class OfferingOption extends BaseFieldModel {
    private static final long serialVersionUID = 6388231929113965279L;
    public FormattedMoney mDisplayValue;
    public boolean mEnabled;
    public boolean mSelected;
    public EtsyId mValue = new EtsyId();

    public boolean equals(Object obj) {
        if (obj instanceof OfferingOption) {
            OfferingOption offeringOption = (OfferingOption) obj;
            return ObjectUtils.equals(this.mDisplayValue, offeringOption.getDisplayValue()) && ObjectUtils.equals(this.mValue, offeringOption.getValue()) && ObjectUtils.equals(Boolean.valueOf(this.mEnabled), Boolean.valueOf(offeringOption.isEnabled())) && ObjectUtils.equals(Boolean.valueOf(this.mSelected), Boolean.valueOf(offeringOption.isSelected()));
        }
    }

    public FormattedMoney getDisplayValue() {
        return this.mDisplayValue;
    }

    public String getFormattedDisplayValue() {
        FormattedMoney formattedMoney = this.mDisplayValue;
        return formattedMoney != null ? formattedMoney.toString() : "";
    }

    public EtsyId getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return ((((ObjectUtils.hashCode(this.mValue) + ((ObjectUtils.hashCode(this.mDisplayValue) + 527) * 31)) * 31) + (this.mEnabled ^ true ? 1 : 0)) * 31) + (this.mSelected ^ true ? 1 : 0);
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public boolean isSelected() {
        return this.mSelected;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals(ResponseConstants.ENABLED)) {
                    c = 0;
                    break;
                }
                break;
            case -1464536140:
                if (str.equals(ResponseConstants.DISPLAY_VALUE)) {
                    c = 1;
                    break;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    c = 2;
                    break;
                }
                break;
            case 1191572123:
                if (str.equals(ResponseConstants.SELECTED)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mEnabled = jsonParser.getValueAsBoolean();
                break;
            case 1:
                this.mDisplayValue = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
                break;
            case 2:
                this.mValue.setId(BaseModel.parseString(jsonParser));
                break;
            case 3:
                this.mSelected = jsonParser.getValueAsBoolean();
                break;
            default:
                return false;
        }
        return true;
    }

    public void setDisplayValue(FormattedMoney formattedMoney) {
        this.mDisplayValue = formattedMoney;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setSelected(boolean z) {
        this.mSelected = z;
    }

    public void setValue(EtsyId etsyId) {
        this.mValue = etsyId;
    }

    public String toString() {
        return getFormattedDisplayValue();
    }
}
