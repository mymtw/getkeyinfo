package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class PaymentAddCoupon extends BaseFieldModel {
    private static final long serialVersionUID = 3134518244101605247L;
    public String mCode = "";
    public String mError = "";
    public String mHint = "";
    public String mLabel = "";

    public String getCode() {
        return this.mCode;
    }

    public String getError() {
        return this.mError;
    }

    public String getHint() {
        return this.mHint;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.CODE.equals(str)) {
            this.mCode = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.ERROR_MESSAGE.equals(str)) {
            this.mError = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.LABEL.equals(str)) {
            this.mLabel = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.HINT.equals(str)) {
            return false;
        } else {
            this.mHint = BaseModel.parseString(jsonParser);
            return true;
        }
    }
}
