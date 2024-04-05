package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class CartVariation extends BaseFieldModel {
    private static final long serialVersionUID = 1466129315543571710L;
    public EtsyAssociativeArray mActionBodyParams = new EtsyAssociativeArray();
    public String mDisplayValue = "";
    public boolean mEnabled = true;
    public String mLabel = "";

    public EtsyAssociativeArray getActionBodyParams() {
        return this.mActionBodyParams;
    }

    public String getDisplayValue() {
        return this.mDisplayValue;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.LABEL.equals(str)) {
            this.mLabel = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.DISPLAY_VALUE.equals(str)) {
            this.mDisplayValue = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.ACTION_BODY_PARAMS.equals(str)) {
            this.mActionBodyParams = (EtsyAssociativeArray) BaseModel.parseObject(jsonParser, EtsyAssociativeArray.class);
            return true;
        } else if (!ResponseConstants.ENABLED.equals(str)) {
            return false;
        } else {
            this.mEnabled = jsonParser.getBooleanValue();
            return true;
        }
    }
}
